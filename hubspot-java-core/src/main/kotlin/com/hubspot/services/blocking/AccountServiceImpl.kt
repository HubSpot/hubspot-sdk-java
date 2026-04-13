// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking

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
import com.hubspot.models.account.AccountGetDailyPrivateAppsUsageParams
import com.hubspot.models.account.AccountGetParams
import com.hubspot.models.account.CollectionResponseApiUsageNoPaging
import com.hubspot.models.account.PortalInformationResponse
import com.hubspot.services.blocking.account.ActivityService
import com.hubspot.services.blocking.account.ActivityServiceImpl
import java.util.function.Consumer

class AccountServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AccountService {

    private val withRawResponse: AccountService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val activity: ActivityService by lazy { ActivityServiceImpl(clientOptions) }

    override fun withRawResponse(): AccountService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountService =
        AccountServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun activity(): ActivityService = activity

    override fun get(
        params: AccountGetParams,
        requestOptions: RequestOptions,
    ): PortalInformationResponse =
        // get /account-info/2026-03/details
        withRawResponse().get(params, requestOptions).parse()

    override fun getDailyPrivateAppsUsage(
        params: AccountGetDailyPrivateAppsUsageParams,
        requestOptions: RequestOptions,
    ): CollectionResponseApiUsageNoPaging =
        // get /account-info/2026-03/api-usage/daily/private-apps
        withRawResponse().getDailyPrivateAppsUsage(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AccountService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val activity: ActivityService.WithRawResponse by lazy {
            ActivityServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AccountService.WithRawResponse =
            AccountServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun activity(): ActivityService.WithRawResponse = activity

        private val getHandler: Handler<PortalInformationResponse> =
            jsonHandler<PortalInformationResponse>(clientOptions.jsonMapper)

        override fun get(
            params: AccountGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PortalInformationResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("account-info", "2026-03", "details")
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

        private val getDailyPrivateAppsUsageHandler: Handler<CollectionResponseApiUsageNoPaging> =
            jsonHandler<CollectionResponseApiUsageNoPaging>(clientOptions.jsonMapper)

        override fun getDailyPrivateAppsUsage(
            params: AccountGetDailyPrivateAppsUsageParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponseApiUsageNoPaging> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "account-info",
                        "2026-03",
                        "api-usage",
                        "daily",
                        "private-apps",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getDailyPrivateAppsUsageHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
