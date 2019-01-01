package fr.kazejiyu.ekumi.ide.internal.lock;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.assertj.core.api.WithAssertions;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.common.util.URI;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("requires-Eclipse-runtime")
@DisplayName("A LockFolder file")
public class LockFolderFileTest implements WithAssertions {
	
	private final static String uri = "platform:/meta/fr.kazejiyu.ekumi.ide.test/";
	
	private URI folderURI;
	
	private Path lockFile;
	
	private LockFolderFile lock;
	
	@BeforeEach
	private void createURI() throws MalformedURLException, URISyntaxException, IOException {
		folderURI = URI.createURI(uri);
		lockFile = Paths.get(FileLocator.resolve(new URL(folderURI.appendSegment(".lock").toString())).toURI());
		lock = new LockFolderFile(folderURI);
	}
	
	@AfterEach
	private void deleteLockFile() throws IOException {
		Files.deleteIfExists(lockFile);
	}
	
	@Nested @DisplayName("When instantiated")
	class WhenInstantiated {
		
		@Test @DisplayName("creates a .lock file in given directory")
		void creates_a_lock_file_in_given_directory() {
			assertThat(lockFile).exists();
		}
		
		@Nested @DisplayName("with a null URI")
		class WithANullURI {
			
			@Test @DisplayName("throws an IOException")
			void throws_an_IOException() {
				assertThatIOException().isThrownBy(() -> 
					new LockFolderFile(null)
				);
			}
			
		}
	}
	
	@Nested @DisplayName("When closed")
	class WhenClosed {
		
		@Test @DisplayName("deletes the .lock file")
		void deletes_the_lock_file() throws IOException {
			lock.close();
			assertThat(lockFile).doesNotExist();
		}
		
	}

}
