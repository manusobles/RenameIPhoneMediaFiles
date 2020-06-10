# What does this do?

Rename images and videos from iPhone using the capture date from `EXIF` metadata.
Resulting filenames are of format `yyyyMMdd_HHmmss`.

## Supported formats

- JPG, JPEG
- MOV

## Shortcomings

- Program renames files in the path only, it does not rename recursively. 

# How to use

Replace placeholder `__FOLDER_PATH_HERE__` with the folder path in `Main.kt`.

# Tech details

Libraries used:
- [Kotlin 1.3.72](https://kotlinlang.org/)
- [Metadata Extractor](https://github.com/drewnoakes/metadata-extractor)

# License

MIT License

Copyright (c) 2020

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.