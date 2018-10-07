java_binary(
    name = "Main",
    srcs = glob(["src/main/java/**/*.java"]),
    deps = [
        "//logger:Logger",
        "@com_google_guava_guava//jar"
    ]
)

java_test(
    name = "MainTest",
    srcs = glob(["src/test/java/**/*.java"]),
    deps = [
        ":Main",
        "//logger:Logger",
        "@com_google_guava_guava//jar"
    ]
)
