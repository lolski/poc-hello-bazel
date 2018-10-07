workspace(
    name = "hello_bazel"
)

maven_jar(
    name = "com_google_guava_guava",
    artifact = "com.google.guava:guava:23.0"
)

http_archive(
    name = "rules_antlr",
    sha256 = "acd2a25f31aeeea5f58cdb434ae109d03826ae7cc11fe9efce1740102e3f4531",
    strip_prefix = "rules_antlr-0.1.0",
    urls = ["https://github.com/marcohu/rules_antlr/archive/0.1.0.tar.gz"],
)

load("@rules_antlr//antlr:deps.bzl", "antlr_dependencies")
antlr_dependencies()