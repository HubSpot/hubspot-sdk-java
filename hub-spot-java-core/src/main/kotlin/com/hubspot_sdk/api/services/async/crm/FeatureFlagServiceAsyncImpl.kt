// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.async.crm.featureflags.AppServiceAsync
import com.hubspot_sdk.api.services.async.crm.featureflags.AppServiceAsyncImpl
import com.hubspot_sdk.api.services.async.crm.featureflags.PortalServiceAsync
import com.hubspot_sdk.api.services.async.crm.featureflags.PortalServiceAsyncImpl
import java.util.function.Consumer

class FeatureFlagServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    FeatureFlagServiceAsync {

    private val withRawResponse: FeatureFlagServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val apps: AppServiceAsync by lazy { AppServiceAsyncImpl(clientOptions) }

    private val portals: PortalServiceAsync by lazy { PortalServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): FeatureFlagServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FeatureFlagServiceAsync =
        FeatureFlagServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun apps(): AppServiceAsync = apps

    override fun portals(): PortalServiceAsync = portals

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FeatureFlagServiceAsync.WithRawResponse {

        private val apps: AppServiceAsync.WithRawResponse by lazy {
            AppServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val portals: PortalServiceAsync.WithRawResponse by lazy {
            PortalServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FeatureFlagServiceAsync.WithRawResponse =
            FeatureFlagServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun apps(): AppServiceAsync.WithRawResponse = apps

        override fun portals(): PortalServiceAsync.WithRawResponse = portals
    }
}
