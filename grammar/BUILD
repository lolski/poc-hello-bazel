package(default_visibility = ["//visibility:public"])

load("@rules_antlr//antlr:antlr4.bzl", "antlr4")

antlr4(
    name = "grammar",
    srcs = glob(["src/main/antlr4/**/*.g4"]),
    package = "com.lolski.hellobazel.grammar",
    visitor = True,
)

java_library(
    name = "Grammar",
    srcs = [":grammar"],
    deps = ["@antlr4_runtime//jar"]
)