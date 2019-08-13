/*
       Licensed to the Apache Software Foundation (ASF) under one
       or more contributor license agreements.  See the NOTICE file
       distributed with this work for additional information
       regarding copyright ownership.  The ASF licenses this file
       to you under the Apache License, Version 2.0 (the
       "License"); you may not use this file except in compliance
       with the License.  You may obtain a copy of the License at

         http://www.apache.org/licenses/LICENSE-2.0

       Unless required by applicable law or agreed to in writing,
       software distributed under the License is distributed on an
       "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
       KIND, either express or implied.  See the License for the
       specific language governing permissions and limitations
       under the License.
*/
package org.apache.cordova.camera;

public class CameraOptions {
    protected int srcType;                    // Destination type (needs to be saved for permission handling)
    protected int destType;                   // Source type (needs to be saved for the permission handling)
    protected boolean saveToPhotoAlbum;       // Should the picture be saved to the device's photo album
    protected int targetHeight;               // desired height of the image
    protected int targetWidth;                // desired width of the image
    protected int encodingType;               // Type of encoding to use
    protected int mediaType;                  // What type of media to retrieve
    protected int mQuality;                   // Compression quality hint (0-100: 0=low quality & high compression, 100=compress of max quality)
    protected boolean correctOrientation;     // Should the pictures orientation be corrected
    protected boolean allowEdit;              // Should we allow the user to crop the image.
}
