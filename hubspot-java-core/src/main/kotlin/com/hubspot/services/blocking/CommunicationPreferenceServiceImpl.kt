// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.checkRequired
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
import com.hubspot.models.communicationpreferences.ActionResponseWithResultsPublicStatus
import com.hubspot.models.communicationpreferences.ActionResponseWithResultsPublicWideStatus
import com.hubspot.models.communicationpreferences.CommunicationPreferenceGenerateLinksParams
import com.hubspot.models.communicationpreferences.CommunicationPreferenceGetStatusesParams
import com.hubspot.models.communicationpreferences.CommunicationPreferenceGetUnsubscribeAllStatusParams
import com.hubspot.models.communicationpreferences.CommunicationPreferenceUnsubscribeAllParams
import com.hubspot.models.communicationpreferences.CommunicationPreferenceUpdateStatusParams
import com.hubspot.models.communicationpreferences.LinkGenerationResponse
import com.hubspot.services.blocking.communicationpreferences.DefinitionService
import com.hubspot.services.blocking.communicationpreferences.DefinitionServiceImpl
import com.hubspot.services.blocking.communicationpreferences.StatusService
import com.hubspot.services.blocking.communicationpreferences.StatusServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CommunicationPreferenceServiceImpl
internal constructor(private val clientOptions: ClientOptions) : CommunicationPreferenceService {

    private val withRawResponse: CommunicationPreferenceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val definitions: DefinitionService by lazy { DefinitionServiceImpl(clientOptions) }

    private val statuses: StatusService by lazy { StatusServiceImpl(clientOptions) }

    override fun withRawResponse(): CommunicationPreferenceService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): CommunicationPreferenceService =
        CommunicationPreferenceServiceImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun definitions(): DefinitionService = definitions

    override fun statuses(): StatusService = statuses

    override fun generateLinks(
        params: CommunicationPreferenceGenerateLinksParams,
        requestOptions: RequestOptions,
    ): LinkGenerationResponse =
        // post /communication-preferences/2026-03/links/generate
        withRawResponse().generateLinks(params, requestOptions).parse()

    override fun getStatuses(
        params: CommunicationPreferenceGetStatusesParams,
        requestOptions: RequestOptions,
    ): ActionResponseWithResultsPublicStatus =
        // get /communication-preferences/2026-03/statuses/{subscriberIdString}
        withRawResponse().getStatuses(params, requestOptions).parse()

    override fun getUnsubscribeAllStatus(
        params: CommunicationPreferenceGetUnsubscribeAllStatusParams,
        requestOptions: RequestOptions,
    ): ActionResponseWithResultsPublicWideStatus =
        // get /communication-preferences/2026-03/statuses/{subscriberIdString}/unsubscribe-all
        withRawResponse().getUnsubscribeAllStatus(params, requestOptions).parse()

    override fun unsubscribeAll(
        params: CommunicationPreferenceUnsubscribeAllParams,
        requestOptions: RequestOptions,
    ): ActionResponseWithResultsPublicStatus =
        // post /communication-preferences/2026-03/statuses/{subscriberIdString}/unsubscribe-all
        withRawResponse().unsubscribeAll(params, requestOptions).parse()

    override fun updateStatus(
        params: CommunicationPreferenceUpdateStatusParams,
        requestOptions: RequestOptions,
    ): ActionResponseWithResultsPublicStatus =
        // post /communication-preferences/2026-03/statuses/{subscriberIdString}
        withRawResponse().updateStatus(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CommunicationPreferenceService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val definitions: DefinitionService.WithRawResponse by lazy {
            DefinitionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val statuses: StatusService.WithRawResponse by lazy {
            StatusServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CommunicationPreferenceService.WithRawResponse =
            CommunicationPreferenceServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun definitions(): DefinitionService.WithRawResponse = definitions

        override fun statuses(): StatusService.WithRawResponse = statuses

        private val generateLinksHandler: Handler<LinkGenerationResponse> =
            jsonHandler<LinkGenerationResponse>(clientOptions.jsonMapper)

        override fun generateLinks(
            params: CommunicationPreferenceGenerateLinksParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LinkGenerationResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("communication-preferences", "2026-03", "links", "generate")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { generateLinksHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getStatusesHandler: Handler<ActionResponseWithResultsPublicStatus> =
            jsonHandler<ActionResponseWithResultsPublicStatus>(clientOptions.jsonMapper)

        override fun getStatuses(
            params: CommunicationPreferenceGetStatusesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionResponseWithResultsPublicStatus> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriberIdString", params.subscriberIdString().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "communication-preferences",
                        "2026-03",
                        "statuses",
                        params._pathParam(0),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getStatusesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getUnsubscribeAllStatusHandler:
            Handler<ActionResponseWithResultsPublicWideStatus> =
            jsonHandler<ActionResponseWithResultsPublicWideStatus>(clientOptions.jsonMapper)

        override fun getUnsubscribeAllStatus(
            params: CommunicationPreferenceGetUnsubscribeAllStatusParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionResponseWithResultsPublicWideStatus> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriberIdString", params.subscriberIdString().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "communication-preferences",
                        "2026-03",
                        "statuses",
                        params._pathParam(0),
                        "unsubscribe-all",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getUnsubscribeAllStatusHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val unsubscribeAllHandler: Handler<ActionResponseWithResultsPublicStatus> =
            jsonHandler<ActionResponseWithResultsPublicStatus>(clientOptions.jsonMapper)

        override fun unsubscribeAll(
            params: CommunicationPreferenceUnsubscribeAllParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionResponseWithResultsPublicStatus> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriberIdString", params.subscriberIdString().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "communication-preferences",
                        "2026-03",
                        "statuses",
                        params._pathParam(0),
                        "unsubscribe-all",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { unsubscribeAllHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateStatusHandler: Handler<ActionResponseWithResultsPublicStatus> =
            jsonHandler<ActionResponseWithResultsPublicStatus>(clientOptions.jsonMapper)

        override fun updateStatus(
            params: CommunicationPreferenceUpdateStatusParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionResponseWithResultsPublicStatus> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subscriberIdString", params.subscriberIdString().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "communication-preferences",
                        "2026-03",
                        "statuses",
                        params._pathParam(0),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateStatusHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
