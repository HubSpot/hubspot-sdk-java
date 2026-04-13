// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.account

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.handlers.errorBodyHandler
import com.hubspot.core.handlers.errorHandler
import com.hubspot.core.handlers.jsonHandler
import com.hubspot.core.http.HttpMethod
import com.hubspot.core.http.HttpRequest
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponse.Handler
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.core.http.parseable
import com.hubspot.core.prepare
import com.hubspot.models.account.activity.ActivityListAuditLogsPage
import com.hubspot.models.account.activity.ActivityListAuditLogsParams
import com.hubspot.models.account.activity.ActivityListLoginActivitiesPage
import com.hubspot.models.account.activity.ActivityListLoginActivitiesParams
import com.hubspot.models.account.activity.ActivityListSecurityActivitiesPage
import com.hubspot.models.account.activity.ActivityListSecurityActivitiesParams
import com.hubspot.models.account.activity.CollectionResponseHydratedCriticalActionForwardPaging
import com.hubspot.models.account.activity.CollectionResponsePublicApiUserActionEventForwardPaging
import com.hubspot.models.account.activity.CollectionResponsePublicLoginAuditForwardPaging
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
    ): ActivityListAuditLogsPage =
        // get /account-info/2026-03/activity/audit-logs
        withRawResponse().listAuditLogs(params, requestOptions).parse()

    override fun listLoginActivities(
        params: ActivityListLoginActivitiesParams,
        requestOptions: RequestOptions,
    ): ActivityListLoginActivitiesPage =
        // get /account-info/2026-03/activity/login
        withRawResponse().listLoginActivities(params, requestOptions).parse()

    override fun listSecurityActivities(
        params: ActivityListSecurityActivitiesParams,
        requestOptions: RequestOptions,
    ): ActivityListSecurityActivitiesPage =
        // get /account-info/2026-03/activity/security
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
        ): HttpResponseFor<ActivityListAuditLogsPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("account-info", "2026-03", "activity", "audit-logs")
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
                    .let {
                        ActivityListAuditLogsPage.builder()
                            .service(ActivityServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val listLoginActivitiesHandler:
            Handler<CollectionResponsePublicLoginAuditForwardPaging> =
            jsonHandler<CollectionResponsePublicLoginAuditForwardPaging>(clientOptions.jsonMapper)

        override fun listLoginActivities(
            params: ActivityListLoginActivitiesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActivityListLoginActivitiesPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("account-info", "2026-03", "activity", "login")
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
                    .let {
                        ActivityListLoginActivitiesPage.builder()
                            .service(ActivityServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
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
        ): HttpResponseFor<ActivityListSecurityActivitiesPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("account-info", "2026-03", "activity", "security")
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
                    .let {
                        ActivityListSecurityActivitiesPage.builder()
                            .service(ActivityServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
