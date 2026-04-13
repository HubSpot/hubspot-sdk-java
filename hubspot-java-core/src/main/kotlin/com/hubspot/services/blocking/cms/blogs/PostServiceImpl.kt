// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.cms.blogs

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.checkRequired
import com.hubspot.core.handlers.emptyHandler
import com.hubspot.core.handlers.errorBodyHandler
import com.hubspot.core.handlers.errorHandler
import com.hubspot.core.http.HttpMethod
import com.hubspot.core.http.HttpRequest
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponse.Handler
import com.hubspot.core.http.json
import com.hubspot.core.http.parseable
import com.hubspot.core.prepare
import com.hubspot.models.cms.blogs.posts.PostCloneParams
import com.hubspot.models.cms.blogs.posts.PostCreateParams
import com.hubspot.models.cms.blogs.posts.PostDeleteParams
import com.hubspot.models.cms.blogs.posts.PostGetDraftByIdParams
import com.hubspot.models.cms.blogs.posts.PostGetParams
import com.hubspot.models.cms.blogs.posts.PostListAuthorsParams
import com.hubspot.models.cms.blogs.posts.PostListParams
import com.hubspot.models.cms.blogs.posts.PostListTagsParams
import com.hubspot.models.cms.blogs.posts.PostPushLiveParams
import com.hubspot.models.cms.blogs.posts.PostQueryAuthorsParams
import com.hubspot.models.cms.blogs.posts.PostQueryParams
import com.hubspot.models.cms.blogs.posts.PostQueryTagsParams
import com.hubspot.models.cms.blogs.posts.PostResetDraftParams
import com.hubspot.models.cms.blogs.posts.PostScheduleParams
import com.hubspot.models.cms.blogs.posts.PostUpdateDraftParams
import com.hubspot.models.cms.blogs.posts.PostUpdateParams
import com.hubspot.services.blocking.cms.blogs.posts.BatchService
import com.hubspot.services.blocking.cms.blogs.posts.BatchServiceImpl
import com.hubspot.services.blocking.cms.blogs.posts.MultiLanguageService
import com.hubspot.services.blocking.cms.blogs.posts.MultiLanguageServiceImpl
import com.hubspot.services.blocking.cms.blogs.posts.RevisionService
import com.hubspot.services.blocking.cms.blogs.posts.RevisionServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PostServiceImpl internal constructor(private val clientOptions: ClientOptions) : PostService {

    private val withRawResponse: PostService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val batch: BatchService by lazy { BatchServiceImpl(clientOptions) }

    private val multiLanguage: MultiLanguageService by lazy {
        MultiLanguageServiceImpl(clientOptions)
    }

    private val revisions: RevisionService by lazy { RevisionServiceImpl(clientOptions) }

    override fun withRawResponse(): PostService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PostService =
        PostServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun batch(): BatchService = batch

    override fun multiLanguage(): MultiLanguageService = multiLanguage

    override fun revisions(): RevisionService = revisions

    override fun create(params: PostCreateParams, requestOptions: RequestOptions): HttpResponse =
        // post /cms/blogs/2026-03/posts
        withRawResponse().create(params, requestOptions)

    override fun update(params: PostUpdateParams, requestOptions: RequestOptions): HttpResponse =
        // patch /cms/blogs/2026-03/posts/{objectId}
        withRawResponse().update(params, requestOptions)

    override fun list(params: PostListParams, requestOptions: RequestOptions): HttpResponse =
        // get /cms/blogs/2026-03/posts/cursor
        withRawResponse().list(params, requestOptions)

    override fun delete(params: PostDeleteParams, requestOptions: RequestOptions) {
        // delete /cms/blogs/2026-03/posts/{objectId}
        withRawResponse().delete(params, requestOptions)
    }

    override fun clone(params: PostCloneParams, requestOptions: RequestOptions): HttpResponse =
        // post /cms/blogs/2026-03/posts/clone
        withRawResponse().clone(params, requestOptions)

    override fun get(params: PostGetParams, requestOptions: RequestOptions): HttpResponse =
        // get /cms/blogs/2026-03/posts/{objectId}
        withRawResponse().get(params, requestOptions)

    override fun getDraftById(
        params: PostGetDraftByIdParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /cms/blogs/2026-03/posts/{objectId}/draft
        withRawResponse().getDraftById(params, requestOptions)

    override fun listAuthors(
        params: PostListAuthorsParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /cms/blogs/2026-03/authors/cursor
        withRawResponse().listAuthors(params, requestOptions)

    override fun listTags(
        params: PostListTagsParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /cms/blogs/2026-03/tags/cursor
        withRawResponse().listTags(params, requestOptions)

    override fun pushLive(params: PostPushLiveParams, requestOptions: RequestOptions) {
        // post /cms/blogs/2026-03/posts/{objectId}/draft/push-live
        withRawResponse().pushLive(params, requestOptions)
    }

    override fun query(params: PostQueryParams, requestOptions: RequestOptions): HttpResponse =
        // get /cms/blogs/2026-03/posts/cursor/query
        withRawResponse().query(params, requestOptions)

    override fun queryAuthors(
        params: PostQueryAuthorsParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /cms/blogs/2026-03/authors/cursor/query
        withRawResponse().queryAuthors(params, requestOptions)

    override fun queryTags(
        params: PostQueryTagsParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /cms/blogs/2026-03/tags/cursor/query
        withRawResponse().queryTags(params, requestOptions)

    override fun resetDraft(params: PostResetDraftParams, requestOptions: RequestOptions) {
        // post /cms/blogs/2026-03/posts/{objectId}/draft/reset
        withRawResponse().resetDraft(params, requestOptions)
    }

    override fun schedule(params: PostScheduleParams, requestOptions: RequestOptions) {
        // post /cms/blogs/2026-03/posts/schedule
        withRawResponse().schedule(params, requestOptions)
    }

    override fun updateDraft(
        params: PostUpdateDraftParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // patch /cms/blogs/2026-03/posts/{objectId}/draft
        withRawResponse().updateDraft(params, requestOptions)

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PostService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val batch: BatchService.WithRawResponse by lazy {
            BatchServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val multiLanguage: MultiLanguageService.WithRawResponse by lazy {
            MultiLanguageServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val revisions: RevisionService.WithRawResponse by lazy {
            RevisionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PostService.WithRawResponse =
            PostServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun batch(): BatchService.WithRawResponse = batch

        override fun multiLanguage(): MultiLanguageService.WithRawResponse = multiLanguage

        override fun revisions(): RevisionService.WithRawResponse = revisions

        override fun create(
            params: PostCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "blogs", "2026-03", "posts")
                    .putHeader("Accept", "*/*")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        override fun update(
            params: PostUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "blogs", "2026-03", "posts", params._pathParam(0))
                    .putHeader("Accept", "*/*")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        override fun list(params: PostListParams, requestOptions: RequestOptions): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "blogs", "2026-03", "posts", "cursor")
                    .putHeader("Accept", "*/*")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: PostDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "blogs", "2026-03", "posts", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        override fun clone(params: PostCloneParams, requestOptions: RequestOptions): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "blogs", "2026-03", "posts", "clone")
                    .putHeader("Accept", "*/*")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        override fun get(params: PostGetParams, requestOptions: RequestOptions): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "blogs", "2026-03", "posts", params._pathParam(0))
                    .putHeader("Accept", "*/*")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        override fun getDraftById(
            params: PostGetDraftByIdParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "blogs",
                        "2026-03",
                        "posts",
                        params._pathParam(0),
                        "draft",
                    )
                    .putHeader("Accept", "*/*")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        override fun listAuthors(
            params: PostListAuthorsParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "blogs", "2026-03", "authors", "cursor")
                    .putHeader("Accept", "*/*")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        override fun listTags(
            params: PostListTagsParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "blogs", "2026-03", "tags", "cursor")
                    .putHeader("Accept", "*/*")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        private val pushLiveHandler: Handler<Void?> = emptyHandler()

        override fun pushLive(
            params: PostPushLiveParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "blogs",
                        "2026-03",
                        "posts",
                        params._pathParam(0),
                        "draft",
                        "push-live",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { pushLiveHandler.handle(it) }
            }
        }

        override fun query(params: PostQueryParams, requestOptions: RequestOptions): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "blogs", "2026-03", "posts", "cursor", "query")
                    .putHeader("Accept", "*/*")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        override fun queryAuthors(
            params: PostQueryAuthorsParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "blogs", "2026-03", "authors", "cursor", "query")
                    .putHeader("Accept", "*/*")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        override fun queryTags(
            params: PostQueryTagsParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "blogs", "2026-03", "tags", "cursor", "query")
                    .putHeader("Accept", "*/*")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        private val resetDraftHandler: Handler<Void?> = emptyHandler()

        override fun resetDraft(
            params: PostResetDraftParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "blogs",
                        "2026-03",
                        "posts",
                        params._pathParam(0),
                        "draft",
                        "reset",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { resetDraftHandler.handle(it) }
            }
        }

        private val scheduleHandler: Handler<Void?> = emptyHandler()

        override fun schedule(
            params: PostScheduleParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "blogs", "2026-03", "posts", "schedule")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { scheduleHandler.handle(it) }
            }
        }

        override fun updateDraft(
            params: PostUpdateDraftParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "blogs",
                        "2026-03",
                        "posts",
                        params._pathParam(0),
                        "draft",
                    )
                    .putHeader("Accept", "*/*")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }
    }
}
