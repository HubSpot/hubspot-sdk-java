// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.conversations

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.conversations.customchannels.CustomChannelUpdateParams
import com.hubspot_sdk.api.models.conversations.customchannels.PublicChannelIntegrationChannelCreate
import com.hubspot_sdk.api.models.conversations.customchannels.PublicChannelIntegrationChannelPatch
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CustomChannelServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val customChannelServiceAsync = client.conversations().customChannels()

        val publicChannelIntegrationChannelFuture =
            customChannelServiceAsync.update(
                CustomChannelUpdateParams.builder()
                    .channelId("channelId")
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
                            .channelDescription(JsonValue.from(mapOf<String, Any>()))
                            .channelLogoUrl(JsonValue.from(mapOf<String, Any>()))
                            .channelAccountConnectionRedirectUrl(
                                JsonValue.from(mapOf<String, Any>())
                            )
                            .name(JsonValue.from(mapOf<String, Any>()))
                            .webhookUrl(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .build()
            )

        val publicChannelIntegrationChannel = publicChannelIntegrationChannelFuture.get()
        publicChannelIntegrationChannel.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val customChannelServiceAsync = client.conversations().customChannels()

        val collectionResponseWithTotalPublicChannelIntegrationChannelForwardPagingFuture =
            customChannelServiceAsync.list()

        val collectionResponseWithTotalPublicChannelIntegrationChannelForwardPaging =
            collectionResponseWithTotalPublicChannelIntegrationChannelForwardPagingFuture.get()
        collectionResponseWithTotalPublicChannelIntegrationChannelForwardPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val customChannelServiceAsync = client.conversations().customChannels()

        val future = customChannelServiceAsync.delete("channelId")

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val customChannelServiceAsync = client.conversations().customChannels()

        val publicChannelIntegrationChannelFuture = customChannelServiceAsync.get("channelId")

        val publicChannelIntegrationChannel = publicChannelIntegrationChannelFuture.get()
        publicChannelIntegrationChannel.validate()
    }
}
