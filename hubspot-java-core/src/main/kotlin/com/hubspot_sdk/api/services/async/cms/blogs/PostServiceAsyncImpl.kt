// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.blogs

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.handlers.emptyHandler
import com.hubspot_sdk.api.core.handlers.errorBodyHandler
import com.hubspot_sdk.api.core.handlers.errorHandler
import com.hubspot_sdk.api.core.handlers.jsonHandler
import com.hubspot_sdk.api.core.http.HttpMethod
import com.hubspot_sdk.api.core.http.HttpRequest
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponse.Handler
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.core.http.json
import com.hubspot_sdk.api.core.http.parseable
import com.hubspot_sdk.api.core.prepareAsync
import com.hubspot_sdk.api.models.cms.blogs.posts.BlogPost
import com.hubspot_sdk.api.models.cms.blogs.posts.CollectionResponseWithTotalBlogPostForwardPaging
import com.hubspot_sdk.api.models.cms.blogs.posts.CollectionResponseWithTotalVersionBlogPost
import com.hubspot_sdk.api.models.cms.blogs.posts.PostAttachToLangGroupParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostCloneParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostCreateLangVariationParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostCreateParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostDeleteParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostDetachFromLangGroupParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostGetDraftByIdParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostGetParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostGetPreviousVersionParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostGetPreviousVersionsPageAsync
import com.hubspot_sdk.api.models.cms.blogs.posts.PostGetPreviousVersionsParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostListPageAsync
import com.hubspot_sdk.api.models.cms.blogs.posts.PostListParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostPushLiveParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostResetDraftParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostRestorePreviousVersionParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostRestorePreviousVersionToDraftParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostScheduleParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostSetLangPrimaryParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostUpdateDraftParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostUpdateLangsParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostUpdateParams
import com.hubspot_sdk.api.models.cms.blogs.posts.VersionBlogPost
import com.hubspot_sdk.api.services.async.cms.blogs.posts.BatchServiceAsync
import com.hubspot_sdk.api.services.async.cms.blogs.posts.BatchServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PostServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PostServiceAsync {

    private val withRawResponse: PostServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val batch: BatchServiceAsync by lazy { BatchServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): PostServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PostServiceAsync =
        PostServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun batch(): BatchServiceAsync = batch

    override fun create(
        params: PostCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BlogPost> =
        // post /cms/v3/blogs/posts
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: PostUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BlogPost> =
        // patch /cms/v3/blogs/posts/{objectId}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: PostListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PostListPageAsync> =
        // get /cms/v3/blogs/posts
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: PostDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /cms/v3/blogs/posts/{objectId}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun attachToLangGroup(
        params: PostAttachToLangGroupParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /cms/v3/blogs/posts/multi-language/attach-to-lang-group
        withRawResponse().attachToLangGroup(params, requestOptions).thenAccept {}

    override fun clone(
        params: PostCloneParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BlogPost> =
        // post /cms/v3/blogs/posts/clone
        withRawResponse().clone(params, requestOptions).thenApply { it.parse() }

    override fun createLangVariation(
        params: PostCreateLangVariationParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BlogPost> =
        // post /cms/v3/blogs/posts/multi-language/create-language-variation
        withRawResponse().createLangVariation(params, requestOptions).thenApply { it.parse() }

    override fun detachFromLangGroup(
        params: PostDetachFromLangGroupParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /cms/v3/blogs/posts/multi-language/detach-from-lang-group
        withRawResponse().detachFromLangGroup(params, requestOptions).thenAccept {}

    override fun get(
        params: PostGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BlogPost> =
        // get /cms/v3/blogs/posts/{objectId}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun getDraftById(
        params: PostGetDraftByIdParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BlogPost> =
        // get /cms/v3/blogs/posts/{objectId}/draft
        withRawResponse().getDraftById(params, requestOptions).thenApply { it.parse() }

    override fun getPreviousVersion(
        params: PostGetPreviousVersionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VersionBlogPost> =
        // get /cms/v3/blogs/posts/{objectId}/revisions/{revisionId}
        withRawResponse().getPreviousVersion(params, requestOptions).thenApply { it.parse() }

    override fun getPreviousVersions(
        params: PostGetPreviousVersionsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PostGetPreviousVersionsPageAsync> =
        // get /cms/v3/blogs/posts/{objectId}/revisions
        withRawResponse().getPreviousVersions(params, requestOptions).thenApply { it.parse() }

    override fun pushLive(
        params: PostPushLiveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /cms/v3/blogs/posts/{objectId}/draft/push-live
        withRawResponse().pushLive(params, requestOptions).thenAccept {}

    override fun resetDraft(
        params: PostResetDraftParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /cms/v3/blogs/posts/{objectId}/draft/reset
        withRawResponse().resetDraft(params, requestOptions).thenAccept {}

    override fun restorePreviousVersion(
        params: PostRestorePreviousVersionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BlogPost> =
        // post /cms/v3/blogs/posts/{objectId}/revisions/{revisionId}/restore
        withRawResponse().restorePreviousVersion(params, requestOptions).thenApply { it.parse() }

    override fun restorePreviousVersionToDraft(
        params: PostRestorePreviousVersionToDraftParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BlogPost> =
        // post /cms/v3/blogs/posts/{objectId}/revisions/{revisionId}/restore-to-draft
        withRawResponse().restorePreviousVersionToDraft(params, requestOptions).thenApply {
            it.parse()
        }

    override fun schedule(
        params: PostScheduleParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /cms/v3/blogs/posts/schedule
        withRawResponse().schedule(params, requestOptions).thenAccept {}

    override fun setLangPrimary(
        params: PostSetLangPrimaryParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // put /cms/v3/blogs/posts/multi-language/set-new-lang-primary
        withRawResponse().setLangPrimary(params, requestOptions).thenAccept {}

    override fun updateDraft(
        params: PostUpdateDraftParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BlogPost> =
        // patch /cms/v3/blogs/posts/{objectId}/draft
        withRawResponse().updateDraft(params, requestOptions).thenApply { it.parse() }

    override fun updateLangs(
        params: PostUpdateLangsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /cms/v3/blogs/posts/multi-language/update-languages
        withRawResponse().updateLangs(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PostServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val batch: BatchServiceAsync.WithRawResponse by lazy {
            BatchServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PostServiceAsync.WithRawResponse =
            PostServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun batch(): BatchServiceAsync.WithRawResponse = batch

        private val createHandler: Handler<BlogPost> =
            jsonHandler<BlogPost>(clientOptions.jsonMapper)

        override fun create(
            params: PostCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BlogPost>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "blogs", "posts")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<BlogPost> =
            jsonHandler<BlogPost>(clientOptions.jsonMapper)

        override fun update(
            params: PostUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BlogPost>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "blogs", "posts", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<CollectionResponseWithTotalBlogPostForwardPaging> =
            jsonHandler<CollectionResponseWithTotalBlogPostForwardPaging>(clientOptions.jsonMapper)

        override fun list(
            params: PostListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PostListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "blogs", "posts")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                PostListPageAsync.builder()
                                    .service(PostServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: PostDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "blogs", "posts", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }

        private val attachToLangGroupHandler: Handler<Void?> = emptyHandler()

        override fun attachToLangGroup(
            params: PostAttachToLangGroupParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "v3",
                        "blogs",
                        "posts",
                        "multi-language",
                        "attach-to-lang-group",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { attachToLangGroupHandler.handle(it) }
                    }
                }
        }

        private val cloneHandler: Handler<BlogPost> =
            jsonHandler<BlogPost>(clientOptions.jsonMapper)

        override fun clone(
            params: PostCloneParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BlogPost>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "blogs", "posts", "clone")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { cloneHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val createLangVariationHandler: Handler<BlogPost> =
            jsonHandler<BlogPost>(clientOptions.jsonMapper)

        override fun createLangVariation(
            params: PostCreateLangVariationParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BlogPost>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "v3",
                        "blogs",
                        "posts",
                        "multi-language",
                        "create-language-variation",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createLangVariationHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val detachFromLangGroupHandler: Handler<Void?> = emptyHandler()

        override fun detachFromLangGroup(
            params: PostDetachFromLangGroupParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "v3",
                        "blogs",
                        "posts",
                        "multi-language",
                        "detach-from-lang-group",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { detachFromLangGroupHandler.handle(it) }
                    }
                }
        }

        private val getHandler: Handler<BlogPost> = jsonHandler<BlogPost>(clientOptions.jsonMapper)

        override fun get(
            params: PostGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BlogPost>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "blogs", "posts", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getDraftByIdHandler: Handler<BlogPost> =
            jsonHandler<BlogPost>(clientOptions.jsonMapper)

        override fun getDraftById(
            params: PostGetDraftByIdParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BlogPost>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "blogs", "posts", params._pathParam(0), "draft")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getDraftByIdHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getPreviousVersionHandler: Handler<VersionBlogPost> =
            jsonHandler<VersionBlogPost>(clientOptions.jsonMapper)

        override fun getPreviousVersion(
            params: PostGetPreviousVersionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VersionBlogPost>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("revisionId", params.revisionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "v3",
                        "blogs",
                        "posts",
                        params._pathParam(0),
                        "revisions",
                        params._pathParam(1),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getPreviousVersionHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getPreviousVersionsHandler:
            Handler<CollectionResponseWithTotalVersionBlogPost> =
            jsonHandler<CollectionResponseWithTotalVersionBlogPost>(clientOptions.jsonMapper)

        override fun getPreviousVersions(
            params: PostGetPreviousVersionsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PostGetPreviousVersionsPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "v3",
                        "blogs",
                        "posts",
                        params._pathParam(0),
                        "revisions",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getPreviousVersionsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                PostGetPreviousVersionsPageAsync.builder()
                                    .service(PostServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val pushLiveHandler: Handler<Void?> = emptyHandler()

        override fun pushLive(
            params: PostPushLiveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "v3",
                        "blogs",
                        "posts",
                        params._pathParam(0),
                        "draft",
                        "push-live",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { pushLiveHandler.handle(it) }
                    }
                }
        }

        private val resetDraftHandler: Handler<Void?> = emptyHandler()

        override fun resetDraft(
            params: PostResetDraftParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "v3",
                        "blogs",
                        "posts",
                        params._pathParam(0),
                        "draft",
                        "reset",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { resetDraftHandler.handle(it) }
                    }
                }
        }

        private val restorePreviousVersionHandler: Handler<BlogPost> =
            jsonHandler<BlogPost>(clientOptions.jsonMapper)

        override fun restorePreviousVersion(
            params: PostRestorePreviousVersionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BlogPost>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("revisionId", params.revisionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "v3",
                        "blogs",
                        "posts",
                        params._pathParam(0),
                        "revisions",
                        params._pathParam(1),
                        "restore",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { restorePreviousVersionHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val restorePreviousVersionToDraftHandler: Handler<BlogPost> =
            jsonHandler<BlogPost>(clientOptions.jsonMapper)

        override fun restorePreviousVersionToDraft(
            params: PostRestorePreviousVersionToDraftParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BlogPost>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("revisionId", params.revisionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "v3",
                        "blogs",
                        "posts",
                        params._pathParam(0),
                        "revisions",
                        params._pathParam(1),
                        "restore-to-draft",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { restorePreviousVersionToDraftHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val scheduleHandler: Handler<Void?> = emptyHandler()

        override fun schedule(
            params: PostScheduleParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "blogs", "posts", "schedule")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { scheduleHandler.handle(it) }
                    }
                }
        }

        private val setLangPrimaryHandler: Handler<Void?> = emptyHandler()

        override fun setLangPrimary(
            params: PostSetLangPrimaryParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "v3",
                        "blogs",
                        "posts",
                        "multi-language",
                        "set-new-lang-primary",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { setLangPrimaryHandler.handle(it) }
                    }
                }
        }

        private val updateDraftHandler: Handler<BlogPost> =
            jsonHandler<BlogPost>(clientOptions.jsonMapper)

        override fun updateDraft(
            params: PostUpdateDraftParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BlogPost>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "blogs", "posts", params._pathParam(0), "draft")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateDraftHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateLangsHandler: Handler<Void?> = emptyHandler()

        override fun updateLangs(
            params: PostUpdateLangsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "v3",
                        "blogs",
                        "posts",
                        "multi-language",
                        "update-languages",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { updateLangsHandler.handle(it) }
                    }
                }
        }
    }
}
