java_binary(
    name = "HelloBazel",
    main_class = "com.lolski.hellobazel.main.Main",
    runtime_deps = ["//main:Main"],
    visibility = ["//visibility:public"]
)

genrule(
    name = "HelloBazelDistribution",
    srcs = ["//:HelloBazel.jar", "//:HelloBazel_deploy.jar"],
    outs = ["hello-bazel-distribution.zip"],
    cmd = "$(location hello-bazel-distribution.sh) $(location //:HelloBazel.jar) $(location //:HelloBazel_deploy.jar) $(location hello-bazel-distribution.zip)",
    tools = ["hello-bazel-distribution.sh"]
)