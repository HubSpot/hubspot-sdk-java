// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.cms.pages

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.handlers.emptyHandler
import com.hubspot.core.handlers.errorBodyHandler
import com.hubspot.core.handlers.errorHandler
import com.hubspot.core.handlers.jsonHandler
import com.hubspot.core.http.HttpMethod
import com.hubspot.core.http.HttpRequest
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponse.Handler
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.core.http.json
import com.hubspot.core.http.parseable
import com.hubspot.core.prepareAsync
import com.hubspot.models.cms.pages.PageData
import com.hubspot.models.cms.pages.multilanguage.MultiLanguageAttachToLangGroupParams
import com.hubspot.models.cms.pages.multilanguage.MultiLanguageCreateLanguageVariationParams
import com.hubspot.models.cms.pages.multilanguage.MultiLanguageDetachFromLangGroupParams
import com.hubspot.models.cms.pages.multilanguage.MultiLanguageSetNewLangPrimaryParams
import com.hubspot.models.cms.pages.multilanguage.MultiLanguageUpdateLanguagesParams
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
        // post /cms/pages/2026-03/site-pages/multi-language/attach-to-lang-group
        withRawResponse().attachToLangGroup(params, requestOptions)

    override fun createLanguageVariation(
        params: MultiLanguageCreateLanguageVariationParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PageData> =
        // post /cms/pages/2026-03/site-pages/multi-language/create-language-variation
        withRawResponse().createLanguageVariation(params, requestOptions).thenApply { it.parse() }

    override fun detachFromLangGroup(
        params: MultiLanguageDetachFromLangGroupParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // post /cms/pages/2026-03/site-pages/multi-language/detach-from-lang-group
        withRawResponse().detachFromLangGroup(params, requestOptions)

    override fun setNewLangPrimary(
        params: MultiLanguageSetNewLangPrimaryParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // put /cms/pages/2026-03/site-pages/multi-language/set-new-lang-primary
        withRawResponse().setNewLangPrimary(params, requestOptions).thenAccept {}

    override fun updateLanguages(
        params: MultiLanguageUpdateLanguagesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // post /cms/pages/2026-03/site-pages/multi-language/update-languages
        withRawResponse().updateLanguages(params, requestOptions)

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
                        "pages",
                        "2026-03",
                        "site-pages",
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

        private val createLanguageVariationHandler: Handler<PageData> =
            jsonHandler<PageData>(clientOptions.jsonMapper)

        override fun createLanguageVariation(
            params: MultiLanguageCreateLanguageVariationParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PageData>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "pages",
                        "2026-03",
                        "site-pages",
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
                        "pages",
                        "2026-03",
                        "site-pages",
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

        private val setNewLangPrimaryHandler: Handler<Void?> = emptyHandler()

        override fun setNewLangPrimary(
            params: MultiLanguageSetNewLangPrimaryParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "pages",
                        "2026-03",
                        "site-pages",
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

        override fun updateLanguages(
            params: MultiLanguageUpdateLanguagesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "pages",
                        "2026-03",
                        "site-pages",
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
