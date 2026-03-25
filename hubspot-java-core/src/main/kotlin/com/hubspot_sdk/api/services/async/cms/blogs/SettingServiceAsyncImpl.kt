// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.blogs

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.handlers.errorBodyHandler
import com.hubspot_sdk.api.core.handlers.errorHandler
import com.hubspot_sdk.api.core.handlers.jsonHandler
import com.hubspot_sdk.api.core.http.HttpMethod
import com.hubspot_sdk.api.core.http.HttpRequest
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponse.Handler
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.core.http.parseable
import com.hubspot_sdk.api.core.prepareAsync
import com.hubspot_sdk.api.models.cms.blogs.settings.Blog
import com.hubspot_sdk.api.models.cms.blogs.settings.BlogVersion
import com.hubspot_sdk.api.models.cms.blogs.settings.CollectionResponseWithTotalBlog
import com.hubspot_sdk.api.models.cms.blogs.settings.CollectionResponseWithTotalBlogVersion
import com.hubspot_sdk.api.models.cms.blogs.settings.SettingGetParams
import com.hubspot_sdk.api.models.cms.blogs.settings.SettingGetRevisionParams
import com.hubspot_sdk.api.models.cms.blogs.settings.SettingListPageAsync
import com.hubspot_sdk.api.models.cms.blogs.settings.SettingListParams
import com.hubspot_sdk.api.models.cms.blogs.settings.SettingListRevisionsPageAsync
import com.hubspot_sdk.api.models.cms.blogs.settings.SettingListRevisionsParams
import com.hubspot_sdk.api.services.async.cms.blogs.settings.MultiLanguageServiceAsync
import com.hubspot_sdk.api.services.async.cms.blogs.settings.MultiLanguageServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SettingServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SettingServiceAsync {

    private val withRawResponse: SettingServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val multiLanguage: MultiLanguageServiceAsync by lazy {
        MultiLanguageServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): SettingServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SettingServiceAsync =
        SettingServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun multiLanguage(): MultiLanguageServiceAsync = multiLanguage

    override fun list(
        params: SettingListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SettingListPageAsync> =
        // get /cms/blog-settings/2026-03/settings
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun get(
        params: SettingGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Blog> =
        // get /cms/blog-settings/2026-03/settings/{blogId}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun getRevision(
        params: SettingGetRevisionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BlogVersion> =
        // get /cms/blog-settings/2026-03/settings/{blogId}/revisions/{revisionId}
        withRawResponse().getRevision(params, requestOptions).thenApply { it.parse() }

    override fun listRevisions(
        params: SettingListRevisionsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SettingListRevisionsPageAsync> =
        // get /cms/blog-settings/2026-03/settings/{blogId}/revisions
        withRawResponse().listRevisions(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SettingServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val multiLanguage: MultiLanguageServiceAsync.WithRawResponse by lazy {
            MultiLanguageServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SettingServiceAsync.WithRawResponse =
            SettingServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun multiLanguage(): MultiLanguageServiceAsync.WithRawResponse = multiLanguage

        private val listHandler: Handler<CollectionResponseWithTotalBlog> =
            jsonHandler<CollectionResponseWithTotalBlog>(clientOptions.jsonMapper)

        override fun list(
            params: SettingListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SettingListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "blog-settings", "2026-03", "settings")
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
                                SettingListPageAsync.builder()
                                    .service(SettingServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val getHandler: Handler<Blog> = jsonHandler<Blog>(clientOptions.jsonMapper)

        override fun get(
            params: SettingGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Blog>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("blogId", params.blogId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "blog-settings",
                        "2026-03",
                        "settings",
                        params._pathParam(0),
                    )
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

        private val getRevisionHandler: Handler<BlogVersion> =
            jsonHandler<BlogVersion>(clientOptions.jsonMapper)

        override fun getRevision(
            params: SettingGetRevisionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BlogVersion>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("revisionId", params.revisionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "blog-settings",
                        "2026-03",
                        "settings",
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
                            .use { getRevisionHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listRevisionsHandler: Handler<CollectionResponseWithTotalBlogVersion> =
            jsonHandler<CollectionResponseWithTotalBlogVersion>(clientOptions.jsonMapper)

        override fun listRevisions(
            params: SettingListRevisionsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SettingListRevisionsPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("blogId", params.blogId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "blog-settings",
                        "2026-03",
                        "settings",
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
                            .use { listRevisionsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                SettingListRevisionsPageAsync.builder()
                                    .service(SettingServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }
    }
}
