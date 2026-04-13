// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.marketing.transactional

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.checkRequired
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
import com.hubspot.core.prepare
import com.hubspot.models.marketing.transactional.CollectionResponseSmtpApiTokenViewForwardPaging
import com.hubspot.models.marketing.transactional.SmtpApiTokenView
import com.hubspot.models.marketing.transactional.smtptokens.SmtpTokenCreateParams
import com.hubspot.models.marketing.transactional.smtptokens.SmtpTokenDeleteParams
import com.hubspot.models.marketing.transactional.smtptokens.SmtpTokenGetParams
import com.hubspot.models.marketing.transactional.smtptokens.SmtpTokenListPage
import com.hubspot.models.marketing.transactional.smtptokens.SmtpTokenListParams
import com.hubspot.models.marketing.transactional.smtptokens.SmtpTokenResetPasswordParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SmtpTokenServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SmtpTokenService {

    private val withRawResponse: SmtpTokenService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SmtpTokenService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SmtpTokenService =
        SmtpTokenServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: SmtpTokenCreateParams,
        requestOptions: RequestOptions,
    ): SmtpApiTokenView =
        // post /marketing/transactional/2026-03/smtp-tokens
        withRawResponse().create(params, requestOptions).parse()

    override fun list(
        params: SmtpTokenListParams,
        requestOptions: RequestOptions,
    ): SmtpTokenListPage =
        // get /marketing/transactional/2026-03/smtp-tokens
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: SmtpTokenDeleteParams, requestOptions: RequestOptions) {
        // delete /marketing/transactional/2026-03/smtp-tokens/{tokenId}
        withRawResponse().delete(params, requestOptions)
    }

    override fun get(params: SmtpTokenGetParams, requestOptions: RequestOptions): SmtpApiTokenView =
        // get /marketing/transactional/2026-03/smtp-tokens/{tokenId}
        withRawResponse().get(params, requestOptions).parse()

    override fun resetPassword(
        params: SmtpTokenResetPasswordParams,
        requestOptions: RequestOptions,
    ): SmtpApiTokenView =
        // post /marketing/transactional/2026-03/smtp-tokens/{tokenId}/password-reset
        withRawResponse().resetPassword(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SmtpTokenService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SmtpTokenService.WithRawResponse =
            SmtpTokenServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<SmtpApiTokenView> =
            jsonHandler<SmtpApiTokenView>(clientOptions.jsonMapper)

        override fun create(
            params: SmtpTokenCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SmtpApiTokenView> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "transactional", "2026-03", "smtp-tokens")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<CollectionResponseSmtpApiTokenViewForwardPaging> =
            jsonHandler<CollectionResponseSmtpApiTokenViewForwardPaging>(clientOptions.jsonMapper)

        override fun list(
            params: SmtpTokenListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SmtpTokenListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("marketing", "transactional", "2026-03", "smtp-tokens")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        SmtpTokenListPage.builder()
                            .service(SmtpTokenServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: SmtpTokenDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val getHandler: Handler<SmtpApiTokenView> =
            jsonHandler<SmtpApiTokenView>(clientOptions.jsonMapper)

        override fun get(
            params: SmtpTokenGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SmtpApiTokenView> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val resetPasswordHandler: Handler<SmtpApiTokenView> =
            jsonHandler<SmtpApiTokenView>(clientOptions.jsonMapper)

        override fun resetPassword(
            params: SmtpTokenResetPasswordParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SmtpApiTokenView> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
