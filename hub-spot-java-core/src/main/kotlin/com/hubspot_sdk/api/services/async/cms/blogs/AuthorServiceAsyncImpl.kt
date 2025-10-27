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
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorAttachToLangGroupParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorCreateBatchParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorCreateLanguageVariationParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorCreateParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorDeleteBatchParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorDeleteParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorDetachFromLangGroupParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorGetBatchParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorGetParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorListPageAsync
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorListParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorSetNewLangPrimaryParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorUpdateBatchParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorUpdateLanguagesParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorUpdateParams
import com.hubspot_sdk.api.models.cms.blogs.authors.BatchResponseBlogAuthor
import com.hubspot_sdk.api.models.cms.blogs.authors.BlogAuthor
import com.hubspot_sdk.api.models.cms.blogs.authors.CollectionResponseWithTotalBlogAuthorForwardPaging
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AuthorServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AuthorServiceAsync {

    private val withRawResponse: AuthorServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AuthorServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AuthorServiceAsync =
        AuthorServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: AuthorCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BlogAuthor> =
        // post /cms/v3/blogs/authors
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: AuthorUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BlogAuthor> =
        // patch /cms/v3/blogs/authors/{objectId}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: AuthorListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AuthorListPageAsync> =
        // get /cms/v3/blogs/authors
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: AuthorDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /cms/v3/blogs/authors/{objectId}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun attachToLangGroup(
        params: AuthorAttachToLangGroupParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /cms/v3/blogs/authors/multi-language/attach-to-lang-group
        withRawResponse().attachToLangGroup(params, requestOptions).thenAccept {}

    override fun createBatch(
        params: AuthorCreateBatchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseBlogAuthor> =
        // post /cms/v3/blogs/authors/batch/create
        withRawResponse().createBatch(params, requestOptions).thenApply { it.parse() }

    override fun createLanguageVariation(
        params: AuthorCreateLanguageVariationParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BlogAuthor> =
        // post /cms/v3/blogs/authors/multi-language/create-language-variation
        withRawResponse().createLanguageVariation(params, requestOptions).thenApply { it.parse() }

    override fun deleteBatch(
        params: AuthorDeleteBatchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /cms/v3/blogs/authors/batch/archive
        withRawResponse().deleteBatch(params, requestOptions).thenAccept {}

    override fun detachFromLangGroup(
        params: AuthorDetachFromLangGroupParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /cms/v3/blogs/authors/multi-language/detach-from-lang-group
        withRawResponse().detachFromLangGroup(params, requestOptions).thenAccept {}

    override fun get(
        params: AuthorGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BlogAuthor> =
        // get /cms/v3/blogs/authors/{objectId}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun getBatch(
        params: AuthorGetBatchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseBlogAuthor> =
        // post /cms/v3/blogs/authors/batch/read
        withRawResponse().getBatch(params, requestOptions).thenApply { it.parse() }

    override fun setNewLangPrimary(
        params: AuthorSetNewLangPrimaryParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // put /cms/v3/blogs/authors/multi-language/set-new-lang-primary
        withRawResponse().setNewLangPrimary(params, requestOptions).thenAccept {}

    override fun updateBatch(
        params: AuthorUpdateBatchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BatchResponseBlogAuthor> =
        // post /cms/v3/blogs/authors/batch/update
        withRawResponse().updateBatch(params, requestOptions).thenApply { it.parse() }

    override fun updateLanguages(
        params: AuthorUpdateLanguagesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /cms/v3/blogs/authors/multi-language/update-languages
        withRawResponse().updateLanguages(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AuthorServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AuthorServiceAsync.WithRawResponse =
            AuthorServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<BlogAuthor> =
            jsonHandler<BlogAuthor>(clientOptions.jsonMapper)

        override fun create(
            params: AuthorCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BlogAuthor>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "blogs", "authors")
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

        private val updateHandler: Handler<BlogAuthor> =
            jsonHandler<BlogAuthor>(clientOptions.jsonMapper)

        override fun update(
            params: AuthorUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BlogAuthor>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "blogs", "authors", params._pathParam(0))
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

        private val listHandler: Handler<CollectionResponseWithTotalBlogAuthorForwardPaging> =
            jsonHandler<CollectionResponseWithTotalBlogAuthorForwardPaging>(
                clientOptions.jsonMapper
            )

        override fun list(
            params: AuthorListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AuthorListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "blogs", "authors")
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
                                AuthorListPageAsync.builder()
                                    .service(AuthorServiceAsyncImpl(clientOptions))
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
            params: AuthorDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "blogs", "authors", params._pathParam(0))
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
            params: AuthorAttachToLangGroupParams,
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
                        "authors",
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

        private val createBatchHandler: Handler<BatchResponseBlogAuthor> =
            jsonHandler<BatchResponseBlogAuthor>(clientOptions.jsonMapper)

        override fun createBatch(
            params: AuthorCreateBatchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseBlogAuthor>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "blogs", "authors", "batch", "create")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createBatchHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val createLanguageVariationHandler: Handler<BlogAuthor> =
            jsonHandler<BlogAuthor>(clientOptions.jsonMapper)

        override fun createLanguageVariation(
            params: AuthorCreateLanguageVariationParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BlogAuthor>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "v3",
                        "blogs",
                        "authors",
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
                            .use { createLanguageVariationHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteBatchHandler: Handler<Void?> = emptyHandler()

        override fun deleteBatch(
            params: AuthorDeleteBatchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "blogs", "authors", "batch", "archive")
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

        private val detachFromLangGroupHandler: Handler<Void?> = emptyHandler()

        override fun detachFromLangGroup(
            params: AuthorDetachFromLangGroupParams,
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
                        "authors",
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

        private val getHandler: Handler<BlogAuthor> =
            jsonHandler<BlogAuthor>(clientOptions.jsonMapper)

        override fun get(
            params: AuthorGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BlogAuthor>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "blogs", "authors", params._pathParam(0))
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

        private val getBatchHandler: Handler<BatchResponseBlogAuthor> =
            jsonHandler<BatchResponseBlogAuthor>(clientOptions.jsonMapper)

        override fun getBatch(
            params: AuthorGetBatchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseBlogAuthor>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "blogs", "authors", "batch", "read")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getBatchHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val setNewLangPrimaryHandler: Handler<Void?> = emptyHandler()

        override fun setNewLangPrimary(
            params: AuthorSetNewLangPrimaryParams,
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
                        "authors",
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
                        response.use { setNewLangPrimaryHandler.handle(it) }
                    }
                }
        }

        private val updateBatchHandler: Handler<BatchResponseBlogAuthor> =
            jsonHandler<BatchResponseBlogAuthor>(clientOptions.jsonMapper)

        override fun updateBatch(
            params: AuthorUpdateBatchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BatchResponseBlogAuthor>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "blogs", "authors", "batch", "update")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateBatchHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateLanguagesHandler: Handler<Void?> = emptyHandler()

        override fun updateLanguages(
            params: AuthorUpdateLanguagesParams,
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
                        "authors",
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
                        response.use { updateLanguagesHandler.handle(it) }
                    }
                }
        }
    }
}
