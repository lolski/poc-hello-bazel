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