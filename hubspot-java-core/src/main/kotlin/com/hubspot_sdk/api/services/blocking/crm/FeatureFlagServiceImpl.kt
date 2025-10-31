// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.crm.featureflags.AppService
import com.hubspot_sdk.api.services.blocking.crm.featureflags.AppServiceImpl
import com.hubspot_sdk.api.services.blocking.crm.featureflags.PortalService
import com.hubspot_sdk.api.services.blocking.crm.featureflags.PortalServiceImpl
import java.util.function.Consumer

class FeatureFlagServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    FeatureFlagService {

    private val withRawResponse: FeatureFlagService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val apps: AppService by lazy { AppServiceImpl(clientOptions) }

    private val portals: PortalService by lazy { PortalServiceImpl(clientOptions) }

    override fun withRawResponse(): FeatureFlagService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FeatureFlagService =
        FeatureFlagServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun apps(): AppService = apps

    override fun portals(): PortalService = portals

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FeatureFlagService.WithRawResponse {

        private val apps: AppService.WithRawResponse by lazy {
            AppServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val portals: PortalService.WithRawResponse by lazy {
            PortalServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FeatureFlagService.WithRawResponse =
            FeatureFlagServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun apps(): AppService.WithRawResponse = apps

        override fun portals(): PortalService.WithRawResponse = portals
    }
}
