// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.account

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
import com.hubspot_sdk.api.core.prepareAsync
import com.hubspot_sdk.api.models.account.activity.ActivityListAuditLogsParams
import com.hubspot_sdk.api.models.account.activity.ActivityListLoginActivitiesParams
import com.hubspot_sdk.api.models.account.activity.ActivityListSecurityActivitiesParams
import com.hubspot_sdk.api.models.account.activity.CollectionResponseHydratedCriticalActionForwardPaging
import com.hubspot_sdk.api.models.account.activity.CollectionResponsePublicApiUserActionEventForwardPaging
import com.hubspot_sdk.api.models.account.activity.CollectionResponsePublicLoginAuditForwardPaging
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
    ): CompletableFuture<CollectionResponsePublicApiUserActionEventForwardPaging> =
        // get /account-info/v3/activity/audit-logs
        withRawResponse().listAuditLogs(params, requestOptions).thenApply { it.parse() }

    override fun listLoginActivities(
        params: ActivityListLoginActivitiesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponsePublicLoginAuditForwardPaging> =
        // get /account-info/v3/activity/login
        withRawResponse().listLoginActivities(params, requestOptions).thenApply { it.parse() }

    override fun listSecurityActivities(
        params: ActivityListSecurityActivitiesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponseHydratedCriticalActionForwardPaging> =
        // get /account-info/v3/activity/security
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
        ): CompletableFuture<
            HttpResponseFor<CollectionResponsePublicApiUserActionEventForwardPaging>
        > {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("account-info", "v3", "activity", "audit-logs")
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
                    }
                }
        }

        private val listLoginActivitiesHandler:
            Handler<CollectionResponsePublicLoginAuditForwardPaging> =
            jsonHandler<CollectionResponsePublicLoginAuditForwardPaging>(clientOptions.jsonMapper)

        override fun listLoginActivities(
            params: ActivityListLoginActivitiesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionResponsePublicLoginAuditForwardPaging>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("account-info", "v3", "activity", "login")
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
        ): CompletableFuture<
            HttpResponseFor<CollectionResponseHydratedCriticalActionForwardPaging>
        > {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("account-info", "v3", "activity", "security")
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
                    }
                }
        }
    }
}
