java_library(
    name = "MainLib",
    srcs = glob(["src/main/java/**/*.java"]),
    deps = [
        "//logger:Logger",
        "@com_google_guava_guava//jar"
    ]
)

java_binary(
    name = "Main",
    main_class = "com.lolski.hellobazel.main.Main",
    runtime_deps = [":MainLib"]
)

java_test(
    name = "MainTest",
    srcs = glob(["src/test/java/**/*.java"]),
    deps = [":MainLib"]
)
