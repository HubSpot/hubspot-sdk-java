// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.automation.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.JsonValue
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicActionLabelsTest {

    @Test
    fun create() {
        val publicActionLabels =
            PublicActionLabels.builder()
                .actionName("actionName")
                .actionCardContent("actionCardContent")
                .actionDescription("actionDescription")
                .appDisplayName("appDisplayName")
                .executionRules(
                    PublicActionLabels.ExecutionRules.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .inputFieldDescriptions(
                    PublicActionLabels.InputFieldDescriptions.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .inputFieldLabels(
                    PublicActionLabels.InputFieldLabels.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .inputFieldOptionLabels(
                    PublicActionLabels.InputFieldOptionLabels.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "string")))
                        .build()
                )
                .outputFieldLabels(
                    PublicActionLabels.OutputFieldLabels.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(publicActionLabels.actionName()).isEqualTo("actionName")
        assertThat(publicActionLabels.actionCardContent()).contains("actionCardContent")
        assertThat(publicActionLabels.actionDescription()).contains("actionDescription")
        assertThat(publicActionLabels.appDisplayName()).contains("appDisplayName")
        assertThat(publicActionLabels.executionRules())
            .contains(
                PublicActionLabels.ExecutionRules.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(publicActionLabels.inputFieldDescriptions())
            .contains(
                PublicActionLabels.InputFieldDescriptions.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(publicActionLabels.inputFieldLabels())
            .contains(
                PublicActionLabels.InputFieldLabels.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(publicActionLabels.inputFieldOptionLabels())
            .contains(
                PublicActionLabels.InputFieldOptionLabels.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "string")))
                    .build()
            )
        assertThat(publicActionLabels.outputFieldLabels())
            .contains(
                PublicActionLabels.OutputFieldLabels.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicActionLabels =
            PublicActionLabels.builder()
                .actionName("actionName")
                .actionCardContent("actionCardContent")
                .actionDescription("actionDescription")
                .appDisplayName("appDisplayName")
                .executionRules(
                    PublicActionLabels.ExecutionRules.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .inputFieldDescriptions(
                    PublicActionLabels.InputFieldDescriptions.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .inputFieldLabels(
                    PublicActionLabels.InputFieldLabels.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .inputFieldOptionLabels(
                    PublicActionLabels.InputFieldOptionLabels.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("foo" to "string")))
                        .build()
                )
                .outputFieldLabels(
                    PublicActionLabels.OutputFieldLabels.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedPublicActionLabels =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicActionLabels),
                jacksonTypeRef<PublicActionLabels>(),
            )

        assertThat(roundtrippedPublicActionLabels).isEqualTo(publicActionLabels)
    }
}
