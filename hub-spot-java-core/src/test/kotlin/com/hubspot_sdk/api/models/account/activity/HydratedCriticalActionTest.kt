// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.account.activity

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HydratedCriticalActionTest {

    @Test
    fun create() {
        val hydratedCriticalAction =
            HydratedCriticalAction.builder()
                .id("5432653")
                .createdAt(OffsetDateTime.parse("2022-04-01T19:36:24.303Z"))
                .type("ADD_USER")
                .userId(876)
                .actingUser("person3@testdomain.com")
                .countryCode("ie")
                .infoUrl("app.hubspot.com/settings/123/users")
                .ipAddress("45.56.67.89")
                .location("location")
                .objectId("7654")
                .regionCode("d")
                .build()

        assertThat(hydratedCriticalAction.id()).isEqualTo("5432653")
        assertThat(hydratedCriticalAction.createdAt())
            .isEqualTo(OffsetDateTime.parse("2022-04-01T19:36:24.303Z"))
        assertThat(hydratedCriticalAction.type()).isEqualTo("ADD_USER")
        assertThat(hydratedCriticalAction.userId()).isEqualTo(876)
        assertThat(hydratedCriticalAction.actingUser()).contains("person3@testdomain.com")
        assertThat(hydratedCriticalAction.countryCode()).contains("ie")
        assertThat(hydratedCriticalAction.infoUrl()).contains("app.hubspot.com/settings/123/users")
        assertThat(hydratedCriticalAction.ipAddress()).contains("45.56.67.89")
        assertThat(hydratedCriticalAction.location()).contains("location")
        assertThat(hydratedCriticalAction.objectId()).contains("7654")
        assertThat(hydratedCriticalAction.regionCode()).contains("d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val hydratedCriticalAction =
            HydratedCriticalAction.builder()
                .id("5432653")
                .createdAt(OffsetDateTime.parse("2022-04-01T19:36:24.303Z"))
                .type("ADD_USER")
                .userId(876)
                .actingUser("person3@testdomain.com")
                .countryCode("ie")
                .infoUrl("app.hubspot.com/settings/123/users")
                .ipAddress("45.56.67.89")
                .location("location")
                .objectId("7654")
                .regionCode("d")
                .build()

        val roundtrippedHydratedCriticalAction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(hydratedCriticalAction),
                jacksonTypeRef<HydratedCriticalAction>(),
            )

        assertThat(roundtrippedHydratedCriticalAction).isEqualTo(hydratedCriticalAction)
    }
}
