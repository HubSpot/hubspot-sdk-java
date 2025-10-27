// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.account

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
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
import com.hubspot_sdk.api.models.account.activity.ActivityListAuditLogsParams
import com.hubspot_sdk.api.models.account.activity.ActivityListLoginActivitiesParams
import com.hubspot_sdk.api.models.account.activity.ActivityListSecurityActivitiesParams
import com.hubspot_sdk.api.models.account.activity.CollectionResponseHydratedCriticalActionForwardPaging
import com.hubspot_sdk.api.models.account.activity.CollectionResponsePublicApiUserActionEventForwardPaging
import com.hubspot_sdk.api.models.account.activity.CollectionResponsePublicLoginAuditForwardPaging
import java.util.function.Consumer

class ActivityServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ActivityService {

    private val withRawResponse: ActivityService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ActivityService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActivityService =
        ActivityServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun listAuditLogs(
        params: ActivityListAuditLogsParams,
        requestOptions: RequestOptions,
    ): CollectionResponsePublicApiUserActionEventForwardPaging =
        // get /account-info/v3/activity/audit-logs
        withRawResponse().listAuditLogs(params, requestOptions).parse()

    override fun listLoginActivities(
        params: ActivityListLoginActivitiesParams,
        requestOptions: RequestOptions,
    ): CollectionResponsePublicLoginAuditForwardPaging =
        // get /account-info/v3/activity/login
        withRawResponse().listLoginActivities(params, requestOptions).parse()

    override fun listSecurityActivities(
        params: ActivityListSecurityActivitiesParams,
        requestOptions: RequestOptions,
    ): CollectionResponseHydratedCriticalActionForwardPaging =
        // get /account-info/v3/activity/security
        withRawResponse().listSecurityActivities(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ActivityService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ActivityService.WithRawResponse =
            ActivityServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listAuditLogsHandler:
            Handler<CollectionResponsePublicApiUserActionEventForwardPaging> =
            jsonHandler<CollectionResponsePublicApiUserActionEventForwardPaging>(
                clientOptions.jsonMapper
            )

        override fun listAuditLogs(
            params: ActivityListAuditLogsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponsePublicApiUserActionEventForwardPaging> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("account-info", "v3", "activity", "audit-logs")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listAuditLogsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listLoginActivitiesHandler:
            Handler<CollectionResponsePublicLoginAuditForwardPaging> =
            jsonHandler<CollectionResponsePublicLoginAuditForwardPaging>(clientOptions.jsonMapper)

        override fun listLoginActivities(
            params: ActivityListLoginActivitiesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponsePublicLoginAuditForwardPaging> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("account-info", "v3", "activity", "login")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listLoginActivitiesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listSecurityActivitiesHandler:
            Handler<CollectionResponseHydratedCriticalActionForwardPaging> =
            jsonHandler<CollectionResponseHydratedCriticalActionForwardPaging>(
                clientOptions.jsonMapper
            )

        override fun listSecurityActivities(
            params: ActivityListSecurityActivitiesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponseHydratedCriticalActionForwardPaging> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("account-info", "v3", "activity", "security")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listSecurityActivitiesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
