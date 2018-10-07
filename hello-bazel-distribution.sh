#!/usr/bin/env bash

script="$1"
jar="$2"
output="$3"

base_dir=hello-bazel-distribution
jar_dir=jar

mkdir "$base_dir"
mkdir "$base_dir/$jar_dir"
cp "$script" "$base_dir"
cp "$jar" "$base_dir/$jar_dir"

zip -r "$output" "$base_dir"

rm -r "$base_dir"