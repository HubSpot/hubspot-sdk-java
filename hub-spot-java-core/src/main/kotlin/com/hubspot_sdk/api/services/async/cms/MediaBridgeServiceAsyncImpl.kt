// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.async.cms.mediabridge.EventServiceAsync
import com.hubspot_sdk.api.services.async.cms.mediabridge.EventServiceAsyncImpl
import com.hubspot_sdk.api.services.async.cms.mediabridge.GroupServiceAsync
import com.hubspot_sdk.api.services.async.cms.mediabridge.GroupServiceAsyncImpl
import com.hubspot_sdk.api.services.async.cms.mediabridge.IntegratorSettingServiceAsync
import com.hubspot_sdk.api.services.async.cms.mediabridge.IntegratorSettingServiceAsyncImpl
import com.hubspot_sdk.api.services.async.cms.mediabridge.PropertyServiceAsync
import com.hubspot_sdk.api.services.async.cms.mediabridge.PropertyServiceAsyncImpl
import com.hubspot_sdk.api.services.async.cms.mediabridge.SchemaServiceAsync
import com.hubspot_sdk.api.services.async.cms.mediabridge.SchemaServiceAsyncImpl
import java.util.function.Consumer

class MediaBridgeServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    MediaBridgeServiceAsync {

    private val withRawResponse: MediaBridgeServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val events: EventServiceAsync by lazy { EventServiceAsyncImpl(clientOptions) }

    private val groups: GroupServiceAsync by lazy { GroupServiceAsyncImpl(clientOptions) }

    private val integratorSettings: IntegratorSettingServiceAsync by lazy {
        IntegratorSettingServiceAsyncImpl(clientOptions)
    }

    private val properties: PropertyServiceAsync by lazy { PropertyServiceAsyncImpl(clientOptions) }

    private val schemas: SchemaServiceAsync by lazy { SchemaServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): MediaBridgeServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MediaBridgeServiceAsync =
        MediaBridgeServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun events(): EventServiceAsync = events

    override fun groups(): GroupServiceAsync = groups

    override fun integratorSettings(): IntegratorSettingServiceAsync = integratorSettings

    override fun properties(): PropertyServiceAsync = properties

    override fun schemas(): SchemaServiceAsync = schemas

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MediaBridgeServiceAsync.WithRawResponse {

        private val events: EventServiceAsync.WithRawResponse by lazy {
            EventServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val groups: GroupServiceAsync.WithRawResponse by lazy {
            GroupServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val integratorSettings: IntegratorSettingServiceAsync.WithRawResponse by lazy {
            IntegratorSettingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val properties: PropertyServiceAsync.WithRawResponse by lazy {
            PropertyServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val schemas: SchemaServiceAsync.WithRawResponse by lazy {
            SchemaServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MediaBridgeServiceAsync.WithRawResponse =
            MediaBridgeServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun events(): EventServiceAsync.WithRawResponse = events

        override fun groups(): GroupServiceAsync.WithRawResponse = groups

        override fun integratorSettings(): IntegratorSettingServiceAsync.WithRawResponse =
            integratorSettings

        override fun properties(): PropertyServiceAsync.WithRawResponse = properties

        override fun schemas(): SchemaServiceAsync.WithRawResponse = schemas
    }
}
