/*******************************************************************************
 * Copyright (c) 2016 Sebastian Stenzel and others.
 * This file is licensed under the terms of the MIT license.
 * See the LICENSE.txt file for more info.
 *
 * Contributors:
 *     Sebastian Stenzel - initial API and implementation
 *******************************************************************************/
package org.cryptomator.filesystem.crypto;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = CryptoFileSystemModule.class)
interface CryptoFileSystemComponent {

	CryptoFileSystemFactory cryptoFileSystemFactory();

}