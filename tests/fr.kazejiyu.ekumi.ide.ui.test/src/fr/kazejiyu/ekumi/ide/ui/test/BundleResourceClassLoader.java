/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.ide.ui.test;

import org.eclipse.core.runtime.FileLocator;

import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Objects;

import static java.util.Collections.list;
import static java.util.stream.Collectors.toList;

public class BundleResourceClassLoader extends ClassLoader {

    public BundleResourceClassLoader(ClassLoader parent) {
        super(parent);
    }

    @Override
    public URL getResource(String name) {
        return resolve(super.getResource(name));
    }

    @Override
    public Enumeration<URL> getResources(String name) throws IOException {
        Enumeration<URL> urls = super.getResources(name);

        List<URL> normalized = list(urls).stream()
                                         .map(this::resolve)
                                         .filter(Objects::nonNull)
                                         .collect(toList());

        return Collections.enumeration(normalized);
    }

    private URL resolve(URL url) {
        try {
            return FileLocator.resolve(url);
        } catch (IOException e) {
            return null;
        }
    }

}
