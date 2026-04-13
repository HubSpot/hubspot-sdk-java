// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.account.activity

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicApiUserActionEventTest {

    @Test
    fun create() {
        val publicApiUserActionEvent =
            PublicApiUserActionEvent.builder()
                .id("id")
                .actingUser(ActingUser.builder().userId(0).userEmail("userEmail").build())
                .action("action")
                .category("category")
                .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .subCategory("subCategory")
                .targetObjectId("targetObjectId")
                .build()

        assertThat(publicApiUserActionEvent.id()).isEqualTo("id")
        assertThat(publicApiUserActionEvent.actingUser())
            .isEqualTo(ActingUser.builder().userId(0).userEmail("userEmail").build())
        assertThat(publicApiUserActionEvent.action()).isEqualTo("action")
        assertThat(publicApiUserActionEvent.category()).isEqualTo("category")
        assertThat(publicApiUserActionEvent.occurredAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicApiUserActionEvent.subCategory()).contains("subCategory")
        assertThat(publicApiUserActionEvent.targetObjectId()).contains("targetObjectId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicApiUserActionEvent =
            PublicApiUserActionEvent.builder()
                .id("id")
                .actingUser(ActingUser.builder().userId(0).userEmail("userEmail").build())
                .action("action")
                .category("category")
                .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .subCategory("subCategory")
                .targetObjectId("targetObjectId")
                .build()

        val roundtrippedPublicApiUserActionEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicApiUserActionEvent),
                jacksonTypeRef<PublicApiUserActionEvent>(),
            )

        assertThat(roundtrippedPublicApiUserActionEvent).isEqualTo(publicApiUserActionEvent)
    }
}
