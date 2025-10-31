// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.automation.actions

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
import com.hubspot_sdk.api.core.prepare
import com.hubspot_sdk.api.models.automation.actions.CollectionResponsePublicActionRevisionForwardPaging
import com.hubspot_sdk.api.models.automation.actions.PublicActionRevision
import com.hubspot_sdk.api.models.automation.actions.revisions.RevisionGetParams
import com.hubspot_sdk.api.models.automation.actions.revisions.RevisionListPage
import com.hubspot_sdk.api.models.automation.actions.revisions.RevisionListParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RevisionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    RevisionService {

    private val withRawResponse: RevisionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RevisionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RevisionService =
        RevisionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: RevisionListParams,
        requestOptions: RequestOptions,
    ): RevisionListPage =
        // get /automation/v4/actions/{appId}/{definitionId}/revisions
        withRawResponse().list(params, requestOptions).parse()

    override fun get(
        params: RevisionGetParams,
        requestOptions: RequestOptions,
    ): PublicActionRevision =
        // get /automation/v4/actions/{appId}/{definitionId}/revisions/{revisionId}
        withRawResponse().get(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RevisionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RevisionService.WithRawResponse =
            RevisionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<CollectionResponsePublicActionRevisionForwardPaging> =
            jsonHandler<CollectionResponsePublicActionRevisionForwardPaging>(
                clientOptions.jsonMapper
            )

        override fun list(
            params: RevisionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RevisionListPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("definitionId", params.definitionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "automation",
                        "v4",
                        "actions",
                        params._pathParam(0),
                        params._pathParam(1),
                        "revisions",
                    )
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
                        RevisionListPage.builder()
                            .service(RevisionServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val getHandler: Handler<PublicActionRevision> =
            jsonHandler<PublicActionRevision>(clientOptions.jsonMapper)

        override fun get(
            params: RevisionGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicActionRevision> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("revisionId", params.revisionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "automation",
                        "v4",
                        "actions",
                        params._pathParam(0),
                        params._pathParam(1),
                        "revisions",
                        params._pathParam(2),
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
    }
}
