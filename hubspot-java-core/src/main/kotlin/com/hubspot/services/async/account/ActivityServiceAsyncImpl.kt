// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.account

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
import com.hubspot.core.prepareAsync
import com.hubspot.models.account.activity.ActivityListAuditLogsPageAsync
import com.hubspot.models.account.activity.ActivityListAuditLogsParams
import com.hubspot.models.account.activity.ActivityListLoginActivitiesPageAsync
import com.hubspot.models.account.activity.ActivityListLoginActivitiesParams
import com.hubspot.models.account.activity.ActivityListSecurityActivitiesPageAsync
import com.hubspot.models.account.activity.ActivityListSecurityActivitiesParams
import com.hubspot.models.account.activity.CollectionResponseHydratedCriticalActionForwardPaging
import com.hubspot.models.account.activity.CollectionResponsePublicApiUserActionEventForwardPaging
import com.hubspot.models.account.activity.CollectionResponsePublicLoginAuditForwardPaging
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class ActivityServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ActivityServiceAsync {

    private val withRawResponse: ActivityServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ActivityServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActivityServiceAsync =
        ActivityServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun listAuditLogs(
        params: ActivityListAuditLogsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActivityListAuditLogsPageAsync> =
        // get /account-info/2026-03/activity/audit-logs
        withRawResponse().listAuditLogs(params, requestOptions).thenApply { it.parse() }

    override fun listLoginActivities(
        params: ActivityListLoginActivitiesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActivityListLoginActivitiesPageAsync> =
        // get /account-info/2026-03/activity/login
        withRawResponse().listLoginActivities(params, requestOptions).thenApply { it.parse() }

    override fun listSecurityActivities(
        params: ActivityListSecurityActivitiesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActivityListSecurityActivitiesPageAsync> =
        // get /account-info/2026-03/activity/security
        withRawResponse().listSecurityActivities(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ActivityServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ActivityServiceAsync.WithRawResponse =
            ActivityServiceAsyncImpl.WithRawResponseImpl(
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
        ): CompletableFuture<HttpResponseFor<ActivityListAuditLogsPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("account-info", "2026-03", "activity", "audit-logs")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listAuditLogsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                ActivityListAuditLogsPageAsync.builder()
                                    .service(ActivityServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
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
        ): CompletableFuture<HttpResponseFor<ActivityListLoginActivitiesPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("account-info", "2026-03", "activity", "login")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listLoginActivitiesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                ActivityListLoginActivitiesPageAsync.builder()
                                    .service(ActivityServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
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
        ): CompletableFuture<HttpResponseFor<ActivityListSecurityActivitiesPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("account-info", "2026-03", "activity", "security")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listSecurityActivitiesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                ActivityListSecurityActivitiesPageAsync.builder()
                                    .service(ActivityServiceAsyncImpl(clientOptions))
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
