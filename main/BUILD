java_library(
    name = "Main",
    srcs = glob(["src/main/java/**/*.java"]),
    deps = [
        "//logger:Logger",
        "@com_google_guava_guava//jar"
    ],
    visibility = ["//visibility:public"]
)

java_test(
    name = "MainTest",
    srcs = glob(["src/test/java/**/*.java"]),
    deps = [":MainLib"]
)