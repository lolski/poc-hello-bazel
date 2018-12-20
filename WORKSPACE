workspace(
    name = "hello_bazel"
)

maven_jar(
    name = "com_google_guava_guava",
    artifact = "com.google.guava:guava:23.0"
)

load("@bazel_tools//tools/build_defs/repo:git.bzl", "git_repository")
git_repository(
    name = "rules_antlr",
    remote = "https://github.com/graknlabs/rules_antlr",
    commit = "e40680fccd90b6bcf3c746f63d48a201152bb67f"
)

load("@rules_antlr//antlr:deps.bzl", "antlr_dependencies")
antlr_dependencies()

http_archive(
  name = "bazel_toolchains",
  sha256 = "07a81ee03f5feae354c9f98c884e8e886914856fb2b6a63cba4619ef10aaaf0b",
  strip_prefix = "bazel-toolchains-31b5dc8c4e9c7fd3f5f4d04c6714f2ce87b126c1",
  urls = [
    "https://mirror.bazel.build/github.com/bazelbuild/bazel-toolchains/archive/31b5dc8c4e9c7fd3f5f4d04c6714f2ce87b126c1.tar.gz",
    "https://github.com/bazelbuild/bazel-toolchains/archive/31b5dc8c4e9c7fd3f5f4d04c6714f2ce87b126c1.tar.gz",
  ],
)