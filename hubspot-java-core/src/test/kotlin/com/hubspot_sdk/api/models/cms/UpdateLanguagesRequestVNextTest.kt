// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UpdateLanguagesRequestVNextTest {

    @Test
    fun create() {
        val updateLanguagesRequestVNext =
            UpdateLanguagesRequestVNext.builder()
                .languages(
                    UpdateLanguagesRequestVNext.Languages.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .primaryId("primaryId")
                .build()

        assertThat(updateLanguagesRequestVNext.languages())
            .isEqualTo(
                UpdateLanguagesRequestVNext.Languages.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(updateLanguagesRequestVNext.primaryId()).isEqualTo("primaryId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val updateLanguagesRequestVNext =
            UpdateLanguagesRequestVNext.builder()
                .languages(
                    UpdateLanguagesRequestVNext.Languages.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .primaryId("primaryId")
                .build()

        val roundtrippedUpdateLanguagesRequestVNext =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(updateLanguagesRequestVNext),
                jacksonTypeRef<UpdateLanguagesRequestVNext>(),
            )

        assertThat(roundtrippedUpdateLanguagesRequestVNext).isEqualTo(updateLanguagesRequestVNext)
    }
}
