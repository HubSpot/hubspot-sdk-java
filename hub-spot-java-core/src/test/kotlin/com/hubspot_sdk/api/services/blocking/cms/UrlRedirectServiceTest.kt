// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClient
import com.hubspot_sdk.api.models.cms.urlredirects.UrlMapping
import com.hubspot_sdk.api.models.cms.urlredirects.UrlMappingCreateRequestBody
import com.hubspot_sdk.api.models.cms.urlredirects.UrlRedirectUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UrlRedirectServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val urlRedirectService = client.cms().urlRedirects()

        val urlMapping =
            urlRedirectService.create(
                UrlMappingCreateRequestBody.builder()
                    .destination("destination")
                    .redirectStyle(0)
                    .routePrefix("routePrefix")
                    .isMatchFullUrl(true)
                    .isMatchQueryString(true)
                    .isOnlyAfterNotFound(true)
                    .isPattern(true)
                    .isProtocolAgnostic(true)
                    .isTrailingSlashOptional(true)
                    .precedence(0)
                    .build()
            )

        urlMapping.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val urlRedirectService = client.cms().urlRedirects()

        val urlMapping =
            urlRedirectService.update(
                UrlRedirectUpdateParams.builder()
                    .urlRedirectId("urlRedirectId")
                    .urlMapping(
                        UrlMapping.builder()
                            .id("id")
                            .destination("destination")
                            .isMatchFullUrl(true)
                            .isMatchQueryString(true)
                            .isOnlyAfterNotFound(true)
                            .isPattern(true)
                            .isProtocolAgnostic(true)
                            .isTrailingSlashOptional(true)
                            .precedence(0)
                            .redirectStyle(0)
                            .routePrefix("routePrefix")
                            .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .build()
            )

        urlMapping.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val urlRedirectService = client.cms().urlRedirects()

        val page = urlRedirectService.list()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val urlRedirectService = client.cms().urlRedirects()

        urlRedirectService.delete("urlRedirectId")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val urlRedirectService = client.cms().urlRedirects()

        val urlMapping = urlRedirectService.get("urlRedirectId")

        urlMapping.validate()
    }
}
