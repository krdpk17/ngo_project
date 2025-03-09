#!/bin/bash

# Create directories if they don't exist
mkdir -p app/src/main/res/mipmap-mdpi
mkdir -p app/src/main/res/mipmap-hdpi
mkdir -p app/src/main/res/mipmap-xhdpi
mkdir -p app/src/main/res/mipmap-xxhdpi
mkdir -p app/src/main/res/mipmap-xxxhdpi

# Copy the base icon to all resolutions
cp app/src/main/res/mipmap-hdpi/ic_launcher.png app/src/main/res/mipmap-mdpi/
cp app/src/main/res/mipmap-hdpi/ic_launcher.png app/src/main/res/mipmap-xhdpi/
cp app/src/main/res/mipmap-hdpi/ic_launcher.png app/src/main/res/mipmap-xxhdpi/
cp app/src/main/res/mipmap-hdpi/ic_launcher.png app/src/main/res/mipmap-xxxhdpi/

# Copy the round icon to all resolutions
cp app/src/main/res/mipmap-hdpi/ic_launcher_round.png app/src/main/res/mipmap-mdpi/
cp app/src/main/res/mipmap-hdpi/ic_launcher_round.png app/src/main/res/mipmap-xhdpi/
cp app/src/main/res/mipmap-hdpi/ic_launcher_round.png app/src/main/res/mipmap-xxhdpi/
cp app/src/main/res/mipmap-hdpi/ic_launcher_round.png app/src/main/res/mipmap-xxxhdpi/

echo "Icons generated successfully!" 