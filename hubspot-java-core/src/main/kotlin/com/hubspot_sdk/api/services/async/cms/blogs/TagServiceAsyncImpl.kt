// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.blogs

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.handlers.emptyHandler
import com.hubspot_sdk.api.core.handlers.errorBodyHandler
import com.hubspot_sdk.api.core.handlers.errorHandler
import com.hubspot_sdk.api.core.http.HttpMethod
import com.hubspot_sdk.api.core.http.HttpRequest
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponse.Handler
import com.hubspot_sdk.api.core.http.json
import com.hubspot_sdk.api.core.http.parseable
import com.hubspot_sdk.api.core.prepareAsync
import com.hubspot_sdk.api.models.cms.blogs.tags.TagAttachToLangGroupParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagCreateBatchParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagCreateLangVariationParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagCreateParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagDeleteBatchParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagDeleteParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagDetachFromLangGroupParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagGetBatchParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagGetParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagListParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagSetLangPrimaryParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagUpdateBatchParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagUpdateLangsParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class TagServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TagServiceAsync {

    private val withRawResponse: TagServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TagServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TagServiceAsync =
        TagServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: TagCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // post /cms/blogs/2026-03/tags
        withRawResponse().create(params, requestOptions)

    override fun update(
        params: TagUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // patch /cms/blogs/2026-03/tags/{objectId}
        withRawResponse().update(params, requestOptions)

    override fun list(
        params: TagListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // get /cms/blogs/2026-03/tags
        withRawResponse().list(params, requestOptions)

    override fun delete(
        params: TagDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /cms/blogs/2026-03/tags/{objectId}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun attachToLangGroup(
        params: TagAttachToLangGroupParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // post /cms/blogs/2026-03/tags/multi-language/attach-to-lang-group
        withRawResponse().attachToLangGroup(params, requestOptions)

    override fun createBatch(
        params: TagCreateBatchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // post /cms/blogs/2026-03/tags/batch/create
        withRawResponse().createBatch(params, requestOptions)

    override fun createLangVariation(
        params: TagCreateLangVariationParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // post /cms/blogs/2026-03/tags/multi-language/create-language-variation
        withRawResponse().createLangVariation(params, requestOptions)

    override fun deleteBatch(
        params: TagDeleteBatchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /cms/blogs/2026-03/tags/batch/archive
        withRawResponse().deleteBatch(params, requestOptions).thenAccept {}

    override fun detachFromLangGroup(
        params: TagDetachFromLangGroupParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // post /cms/blogs/2026-03/tags/multi-language/detach-from-lang-group
        withRawResponse().detachFromLangGroup(params, requestOptions)

    override fun get(
        params: TagGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // get /cms/blogs/2026-03/tags/{objectId}
        withRawResponse().get(params, requestOptions)

    override fun getBatch(
        params: TagGetBatchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // post /cms/blogs/2026-03/tags/batch/read
        withRawResponse().getBatch(params, requestOptions)

    override fun setLangPrimary(
        params: TagSetLangPrimaryParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // put /cms/blogs/2026-03/tags/multi-language/set-new-lang-primary
        withRawResponse().setLangPrimary(params, requestOptions).thenAccept {}

    override fun updateBatch(
        params: TagUpdateBatchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // post /cms/blogs/2026-03/tags/batch/update
        withRawResponse().updateBatch(params, requestOptions)

    override fun updateLangs(
        params: TagUpdateLangsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // post /cms/blogs/2026-03/tags/multi-language/update-languages
        withRawResponse().updateLangs(params, requestOptions)

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TagServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TagServiceAsync.WithRawResponse =
            TagServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun create(
            params: TagCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "blogs", "2026-03", "tags")
                    .putHeader("Accept", "*/*")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response -> errorHandler.handle(response) }
        }

        override fun update(
            params: TagUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "blogs", "2026-03", "tags", params._pathParam(0))
                    .putHeader("Accept", "*/*")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response -> errorHandler.handle(response) }
        }

        override fun list(
            params: TagListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "blogs", "2026-03", "tags")
                    .putHeader("Accept", "*/*")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response -> errorHandler.handle(response) }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: TagDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "blogs", "2026-03", "tags", params._pathParam(0))
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

        override fun attachToLangGroup(
            params: TagAttachToLangGroupParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "blogs",
                        "2026-03",
                        "tags",
                        "multi-language",
                        "attach-to-lang-group",
                    )
                    .putHeader("Accept", "*/*")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response -> errorHandler.handle(response) }
        }

        override fun createBatch(
            params: TagCreateBatchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "blogs", "2026-03", "tags", "batch", "create")
                    .putHeader("Accept", "*/*")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response -> errorHandler.handle(response) }
        }

        override fun createLangVariation(
            params: TagCreateLangVariationParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "blogs",
                        "2026-03",
                        "tags",
                        "multi-language",
                        "create-language-variation",
                    )
                    .putHeader("Accept", "*/*")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response -> errorHandler.handle(response) }
        }

        private val deleteBatchHandler: Handler<Void?> = emptyHandler()

        override fun deleteBatch(
            params: TagDeleteBatchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "blogs", "2026-03", "tags", "batch", "archive")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteBatchHandler.handle(it) }
                    }
                }
        }

        override fun detachFromLangGroup(
            params: TagDetachFromLangGroupParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "blogs",
                        "2026-03",
                        "tags",
                        "multi-language",
                        "detach-from-lang-group",
                    )
                    .putHeader("Accept", "*/*")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response -> errorHandler.handle(response) }
        }

        override fun get(
            params: TagGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "blogs", "2026-03", "tags", params._pathParam(0))
                    .putHeader("Accept", "*/*")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response -> errorHandler.handle(response) }
        }

        override fun getBatch(
            params: TagGetBatchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "blogs", "2026-03", "tags", "batch", "read")
                    .putHeader("Accept", "*/*")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response -> errorHandler.handle(response) }
        }

        private val setLangPrimaryHandler: Handler<Void?> = emptyHandler()

        override fun setLangPrimary(
            params: TagSetLangPrimaryParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "blogs",
                        "2026-03",
                        "tags",
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

        override fun updateBatch(
            params: TagUpdateBatchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "blogs", "2026-03", "tags", "batch", "update")
                    .putHeader("Accept", "*/*")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response -> errorHandler.handle(response) }
        }

        override fun updateLangs(
            params: TagUpdateLangsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "blogs",
                        "2026-03",
                        "tags",
                        "multi-language",
                        "update-languages",
                    )
                    .putHeader("Accept", "*/*")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response -> errorHandler.handle(response) }
        }
    }
}
