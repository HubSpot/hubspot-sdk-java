// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.marketing.transactional

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.handlers.emptyHandler
import com.hubspot.sdk.core.handlers.errorBodyHandler
import com.hubspot.sdk.core.handlers.errorHandler
import com.hubspot.sdk.core.handlers.jsonHandler
import com.hubspot.sdk.core.http.HttpMethod
import com.hubspot.sdk.core.http.HttpRequest
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponse.Handler
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.core.http.json
import com.hubspot.sdk.core.http.parseable
import com.hubspot.sdk.core.prepareAsync
import com.hubspot.sdk.models.marketing.transactional.CollectionResponseSmtpApiTokenViewForwardPaging
import com.hubspot.sdk.models.marketing.transactional.SmtpApiTokenView
import com.hubspot.sdk.models.marketing.transactional.smtptokens.SmtpTokenCreateParams
import com.hubspot.sdk.models.marketing.transactional.smtptokens.SmtpTokenDeleteParams
import com.hubspot.sdk.models.marketing.transactional.smtptokens.SmtpTokenGetParams
import com.hubspot.sdk.models.marketing.transactional.smtptokens.SmtpTokenListPageAsync
import com.hubspot.sdk.models.marketing.transactional.smtptokens.SmtpTokenListParams
import com.hubspot.sdk.models.marketing.transactional.smtptokens.SmtpTokenResetPasswordParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SmtpTokenServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SmtpTokenServiceAsync {

    private val withRawResponse: SmtpTokenServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SmtpTokenServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SmtpTokenServiceAsync =
        SmtpTokenServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: SmtpTokenCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SmtpApiTokenView> =
        // post /marketing/transactional/2026-03/smtp-tokens
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: SmtpTokenListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SmtpTokenListPageAsync> =
        // get /marketing/transactional/2026-03/smtp-tokens
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: SmtpTokenDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /marketing/transactional/2026-03/smtp-tokens/{tokenId}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun get(
        params: SmtpTokenGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SmtpApiTokenView> =
        // get /marketing/transactional/2026-03/smtp-tokens/{tokenId}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun resetPassword(
        params: SmtpTokenResetPasswordParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SmtpApiTokenView> =
        // post /marketing/transactional/2026-03/smtp-tokens/{tokenId}/password-reset
        withRawResponse().resetPassword(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SmtpTokenServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SmtpTokenServiceAsync.WithRawResponse =
            SmtpTokenServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<SmtpApiTokenView> =
            jsonHandler<SmtpApiTokenView>(clientOptions.jsonMapper)

        override fun create(
            params: SmtpTokenCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SmtpApiTokenView>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "transactional", "2026-03", "smtp-tokens")
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

        private val listHandler: Handler<CollectionResponseSmtpApiTokenViewForwardPaging> =
            jsonHandler<CollectionResponseSmtpApiTokenViewForwardPaging>(clientOptions.jsonMapper)

        override fun list(
            params: SmtpTokenListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SmtpTokenListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "transactional", "2026-03", "smtp-tokens")
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
                                SmtpTokenListPageAsync.builder()
                                    .service(SmtpTokenServiceAsyncImpl(clientOptions))
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
            params: SmtpTokenDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("tokenId", params.tokenId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "transactional",
                        "2026-03",
                        "smtp-tokens",
                        params._pathParam(0),
                    )
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

        private val getHandler: Handler<SmtpApiTokenView> =
            jsonHandler<SmtpApiTokenView>(clientOptions.jsonMapper)

        override fun get(
            params: SmtpTokenGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SmtpApiTokenView>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("tokenId", params.tokenId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "transactional",
                        "2026-03",
                        "smtp-tokens",
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

        private val resetPasswordHandler: Handler<SmtpApiTokenView> =
            jsonHandler<SmtpApiTokenView>(clientOptions.jsonMapper)

        override fun resetPassword(
            params: SmtpTokenResetPasswordParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SmtpApiTokenView>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("tokenId", params.tokenId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "marketing",
                        "transactional",
                        "2026-03",
                        "smtp-tokens",
                        params._pathParam(0),
                        "password-reset",
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
                            .use { resetPasswordHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
