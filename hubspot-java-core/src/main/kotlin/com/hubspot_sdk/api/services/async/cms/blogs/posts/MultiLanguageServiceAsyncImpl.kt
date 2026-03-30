// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.blogs.posts

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
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
import com.hubspot_sdk.api.models.cms.blogs.posts.multilanguage.MultiLanguageAttachToLangGroupParams
import com.hubspot_sdk.api.models.cms.blogs.posts.multilanguage.MultiLanguageCreateLangVariationParams
import com.hubspot_sdk.api.models.cms.blogs.posts.multilanguage.MultiLanguageDetachFromLangGroupParams
import com.hubspot_sdk.api.models.cms.blogs.posts.multilanguage.MultiLanguageSetLangPrimaryParams
import com.hubspot_sdk.api.models.cms.blogs.posts.multilanguage.MultiLanguageUpdateLangsParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class MultiLanguageServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    MultiLanguageServiceAsync {

    private val withRawResponse: MultiLanguageServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MultiLanguageServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MultiLanguageServiceAsync =
        MultiLanguageServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun attachToLangGroup(
        params: MultiLanguageAttachToLangGroupParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // post /cms/blogs/2026-03/posts/multi-language/attach-to-lang-group
        withRawResponse().attachToLangGroup(params, requestOptions)

    override fun createLangVariation(
        params: MultiLanguageCreateLangVariationParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // post /cms/blogs/2026-03/posts/multi-language/create-language-variation
        withRawResponse().createLangVariation(params, requestOptions)

    override fun detachFromLangGroup(
        params: MultiLanguageDetachFromLangGroupParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // post /cms/blogs/2026-03/posts/multi-language/detach-from-lang-group
        withRawResponse().detachFromLangGroup(params, requestOptions)

    override fun setLangPrimary(
        params: MultiLanguageSetLangPrimaryParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // put /cms/blogs/2026-03/posts/multi-language/set-new-lang-primary
        withRawResponse().setLangPrimary(params, requestOptions).thenAccept {}

    override fun updateLangs(
        params: MultiLanguageUpdateLangsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // post /cms/blogs/2026-03/posts/multi-language/update-languages
        withRawResponse().updateLangs(params, requestOptions)

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MultiLanguageServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MultiLanguageServiceAsync.WithRawResponse =
            MultiLanguageServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun attachToLangGroup(
            params: MultiLanguageAttachToLangGroupParams,
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
                        "posts",
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

        override fun createLangVariation(
            params: MultiLanguageCreateLangVariationParams,
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
                        "posts",
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

        override fun detachFromLangGroup(
            params: MultiLanguageDetachFromLangGroupParams,
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
                        "posts",
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

        private val setLangPrimaryHandler: Handler<Void?> = emptyHandler()

        override fun setLangPrimary(
            params: MultiLanguageSetLangPrimaryParams,
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

        override fun updateLangs(
            params: MultiLanguageUpdateLangsParams,
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
                        "posts",
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
