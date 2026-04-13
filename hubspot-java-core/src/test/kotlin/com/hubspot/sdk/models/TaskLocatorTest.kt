// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TaskLocatorTest {

    @Test
    fun create() {
        val taskLocator =
            TaskLocator.builder()
                .id("id")
                .links(
                    TaskLocator.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(taskLocator.id()).isEqualTo("id")
        assertThat(taskLocator.links())
            .contains(
                TaskLocator.Links.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val taskLocator =
            TaskLocator.builder()
                .id("id")
                .links(
                    TaskLocator.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedTaskLocator =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(taskLocator),
                jacksonTypeRef<TaskLocator>(),
            )

        assertThat(roundtrippedTaskLocator).isEqualTo(taskLocator)
    }
}
