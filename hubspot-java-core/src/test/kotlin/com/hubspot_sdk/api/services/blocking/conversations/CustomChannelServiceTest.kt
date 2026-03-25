// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.conversations

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.conversations.customchannels.CustomChannelGetParams
import com.hubspot_sdk.api.models.conversations.customchannels.CustomChannelUpdateParams
import com.hubspot_sdk.api.models.conversations.customchannels.PublicChannelIntegrationChannelCreate
import com.hubspot_sdk.api.models.conversations.customchannels.PublicChannelIntegrationChannelPatch
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CustomChannelServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val customChannelService = client.conversations().customChannels()

        val publicChannelIntegrationChannel =
            customChannelService.create(
                PublicChannelIntegrationChannelCreate.builder()
                    .capabilities(
                        PublicChannelIntegrationChannelCreate.Capabilities.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .name("name")
                    .channelAccountConnectionRedirectUrl("channelAccountConnectionRedirectUrl")
                    .channelDescription("channelDescription")
                    .channelLogoUrl("channelLogoUrl")
                    .webhookUrl("webhookUrl")
                    .build()
            )

        publicChannelIntegrationChannel.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val customChannelService = client.conversations().customChannels()

        val publicChannelIntegrationChannel =
            customChannelService.update(
                CustomChannelUpdateParams.builder()
                    .channelId(0)
                    .publicChannelIntegrationChannelPatch(
                        PublicChannelIntegrationChannelPatch.builder()
                            .capabilities(
                                PublicChannelIntegrationChannelPatch.Capabilities.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                    .build()
                            )
                            .channelAccountConnectionRedirectUrl(
                                JsonValue.from(mapOf<String, Any>())
                            )
                            .channelDescription(JsonValue.from(mapOf<String, Any>()))
                            .channelLogoUrl(JsonValue.from(mapOf<String, Any>()))
                            .name(JsonValue.from(mapOf<String, Any>()))
                            .webhookUrl(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .build()
            )

        publicChannelIntegrationChannel.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val customChannelService = client.conversations().customChannels()

        val page = customChannelService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val customChannelService = client.conversations().customChannels()

        customChannelService.delete(0)
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val customChannelService = client.conversations().customChannels()

        val publicChannelAccount =
            customChannelService.get(
                CustomChannelGetParams.builder()
                    .channelId(0)
                    .channelAccountId(0L)
                    .archived(true)
                    .build()
            )

        publicChannelAccount.validate()
    }
}
