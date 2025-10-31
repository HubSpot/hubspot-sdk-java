// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.cms.mediabridge.EventService
import com.hubspot_sdk.api.services.blocking.cms.mediabridge.EventServiceImpl
import com.hubspot_sdk.api.services.blocking.cms.mediabridge.GroupService
import com.hubspot_sdk.api.services.blocking.cms.mediabridge.GroupServiceImpl
import com.hubspot_sdk.api.services.blocking.cms.mediabridge.IntegratorSettingService
import com.hubspot_sdk.api.services.blocking.cms.mediabridge.IntegratorSettingServiceImpl
import com.hubspot_sdk.api.services.blocking.cms.mediabridge.PropertyService
import com.hubspot_sdk.api.services.blocking.cms.mediabridge.PropertyServiceImpl
import com.hubspot_sdk.api.services.blocking.cms.mediabridge.SchemaService
import com.hubspot_sdk.api.services.blocking.cms.mediabridge.SchemaServiceImpl
import java.util.function.Consumer

class MediaBridgeServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MediaBridgeService {

    private val withRawResponse: MediaBridgeService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val events: EventService by lazy { EventServiceImpl(clientOptions) }

    private val groups: GroupService by lazy { GroupServiceImpl(clientOptions) }

    private val integratorSettings: IntegratorSettingService by lazy {
        IntegratorSettingServiceImpl(clientOptions)
    }

    private val properties: PropertyService by lazy { PropertyServiceImpl(clientOptions) }

    private val schemas: SchemaService by lazy { SchemaServiceImpl(clientOptions) }

    override fun withRawResponse(): MediaBridgeService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MediaBridgeService =
        MediaBridgeServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun events(): EventService = events

    override fun groups(): GroupService = groups

    override fun integratorSettings(): IntegratorSettingService = integratorSettings

    override fun properties(): PropertyService = properties

    override fun schemas(): SchemaService = schemas

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MediaBridgeService.WithRawResponse {

        private val events: EventService.WithRawResponse by lazy {
            EventServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val groups: GroupService.WithRawResponse by lazy {
            GroupServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val integratorSettings: IntegratorSettingService.WithRawResponse by lazy {
            IntegratorSettingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val properties: PropertyService.WithRawResponse by lazy {
            PropertyServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val schemas: SchemaService.WithRawResponse by lazy {
            SchemaServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MediaBridgeService.WithRawResponse =
            MediaBridgeServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun events(): EventService.WithRawResponse = events

        override fun groups(): GroupService.WithRawResponse = groups

        override fun integratorSettings(): IntegratorSettingService.WithRawResponse =
            integratorSettings

        override fun properties(): PropertyService.WithRawResponse = properties

        override fun schemas(): SchemaService.WithRawResponse = schemas
    }
}
