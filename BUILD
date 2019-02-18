java_binary(
    name = "HelloBazel",
    main_class = "com.lolski.hellobazel.main.Main",
    runtime_deps = ["//main:Main"],
    visibility = ["//visibility:public"]
)

genrule(
    name = "HelloBazelDistribution",
    srcs = ["hello-bazel.sh", "HelloBazel_deploy.jar"],
    outs = ["hello-bazel-distribution.zip"],
    cmd = "$(location hello-bazel-distribution.sh) $(location hello-bazel.sh) $(location HelloBazel_deploy.jar) $(location hello-bazel-distribution.zip)",
    tools = ["hello-bazel-distribution.sh"]
)

exports_files(["deployment.properties"])
