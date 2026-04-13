// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.automation.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicConditionalSingleFieldDependencyTest {

    @Test
    fun create() {
        val publicConditionalSingleFieldDependency =
            PublicConditionalSingleFieldDependency.builder()
                .controllingFieldName("controllingFieldName")
                .controllingFieldValue("controllingFieldValue")
                .dependencyType(
                    PublicConditionalSingleFieldDependency.DependencyType.CONDITIONAL_SINGLE_FIELD
                )
                .addDependentFieldName("string")
                .build()

        assertThat(publicConditionalSingleFieldDependency.controllingFieldName())
            .isEqualTo("controllingFieldName")
        assertThat(publicConditionalSingleFieldDependency.controllingFieldValue())
            .isEqualTo("controllingFieldValue")
        assertThat(publicConditionalSingleFieldDependency.dependencyType())
            .isEqualTo(
                PublicConditionalSingleFieldDependency.DependencyType.CONDITIONAL_SINGLE_FIELD
            )
        assertThat(publicConditionalSingleFieldDependency.dependentFieldNames())
            .containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicConditionalSingleFieldDependency =
            PublicConditionalSingleFieldDependency.builder()
                .controllingFieldName("controllingFieldName")
                .controllingFieldValue("controllingFieldValue")
                .dependencyType(
                    PublicConditionalSingleFieldDependency.DependencyType.CONDITIONAL_SINGLE_FIELD
                )
                .addDependentFieldName("string")
                .build()

        val roundtrippedPublicConditionalSingleFieldDependency =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicConditionalSingleFieldDependency),
                jacksonTypeRef<PublicConditionalSingleFieldDependency>(),
            )

        assertThat(roundtrippedPublicConditionalSingleFieldDependency)
            .isEqualTo(publicConditionalSingleFieldDependency)
    }
}
