package fr.kazejiyu.ekumi.ide.internal.lock;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.common.util.URI;

/**
 * Temporarily creates a <i>.lock</i> in a given directory
 * for the scope of a try-with-resource statement.
 */
public class LockFolderFile implements AutoCloseable {
	
	/**
	 * The .lock file
	 */
	private final Path lock;
	
	/**
	 * Creates a <i>.lock</i> file under given directory.
	 * 
	 * @param folderURI
	 * 			The URI of the folder to lock.
	 * 
	 * @throws IOException if an error occurs while creating the lock file
	 */
	public LockFolderFile(URI folderURI) throws IOException  {
		try {
			lock = Paths.get(FileLocator.resolve(new URL(folderURI.appendSegment(".lock").toString())).toURI());
			
			Files.createDirectories(lock.getParent());
			Files.createFile(lock);
			
		} catch (Exception e) {
			throw new IOException("Unable to create the .lock file under " + folderURI, e);
		}
	}

	/**
	 * Deletes the lock file from the hard disk.
	 */
	@Override
	public void close() throws IOException {
		Files.deleteIfExists(lock);
	}
	
}