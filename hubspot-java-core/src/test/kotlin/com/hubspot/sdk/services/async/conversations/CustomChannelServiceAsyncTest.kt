// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.conversations

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.models.conversations.customchannels.CustomChannelGetParams
import com.hubspot.sdk.models.conversations.customchannels.CustomChannelUpdateParams
import com.hubspot.sdk.models.conversations.customchannels.PublicChannelIntegrationChannelCreate
import com.hubspot.sdk.models.conversations.customchannels.PublicChannelIntegrationChannelPatch
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CustomChannelServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val customChannelServiceAsync = client.conversations().customChannels()

        val publicChannelIntegrationChannelFuture =
            customChannelServiceAsync.create(
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

        val publicChannelIntegrationChannel = publicChannelIntegrationChannelFuture.get()
        publicChannelIntegrationChannel.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val customChannelServiceAsync = client.conversations().customChannels()

        val publicChannelIntegrationChannelFuture =
            customChannelServiceAsync.update(
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

        val publicChannelIntegrationChannel = publicChannelIntegrationChannelFuture.get()
        publicChannelIntegrationChannel.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val customChannelServiceAsync = client.conversations().customChannels()

        val pageFuture = customChannelServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val customChannelServiceAsync = client.conversations().customChannels()

        val future = customChannelServiceAsync.delete(0)

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val customChannelServiceAsync = client.conversations().customChannels()

        val publicChannelAccountFuture =
            customChannelServiceAsync.get(
                CustomChannelGetParams.builder()
                    .channelId(0)
                    .channelAccountId(0L)
                    .archived(true)
                    .build()
            )

        val publicChannelAccount = publicChannelAccountFuture.get()
        publicChannelAccount.validate()
    }
}
