// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import com.hubspot.sdk.models.AssociationSpec
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RollupExpressionTest {

    @Test
    fun create() {
        val rollupExpression =
            RollupExpression.builder()
                .addAssociationType(
                    AssociationSpec.builder()
                        .associationCategory(AssociationSpec.AssociationCategory.HUBSPOT_DEFINED)
                        .associationTypeId(0)
                        .build()
                )
                .rollupOperator(RollupExpression.RollupOperator.AVERAGE)
                .sourceObjectTypeId("sourceObjectTypeId")
                .sourcePropertyName("sourcePropertyName")
                .conditionalExpression(JsonValue.from(mapOf<String, Any>()))
                .conditionalFormula("conditionalFormula")
                .emptyRollupValue("emptyRollupValue")
                .sourceCompareByPropertyName("sourceCompareByPropertyName")
                .build()

        assertThat(rollupExpression.associationTypes())
            .containsExactly(
                AssociationSpec.builder()
                    .associationCategory(AssociationSpec.AssociationCategory.HUBSPOT_DEFINED)
                    .associationTypeId(0)
                    .build()
            )
        assertThat(rollupExpression.rollupOperator())
            .isEqualTo(RollupExpression.RollupOperator.AVERAGE)
        assertThat(rollupExpression.sourceObjectTypeId()).isEqualTo("sourceObjectTypeId")
        assertThat(rollupExpression.sourcePropertyName()).isEqualTo("sourcePropertyName")
        assertThat(rollupExpression._conditionalExpression())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(rollupExpression.conditionalFormula()).contains("conditionalFormula")
        assertThat(rollupExpression.emptyRollupValue()).contains("emptyRollupValue")
        assertThat(rollupExpression.sourceCompareByPropertyName())
            .contains("sourceCompareByPropertyName")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rollupExpression =
            RollupExpression.builder()
                .addAssociationType(
                    AssociationSpec.builder()
                        .associationCategory(AssociationSpec.AssociationCategory.HUBSPOT_DEFINED)
                        .associationTypeId(0)
                        .build()
                )
                .rollupOperator(RollupExpression.RollupOperator.AVERAGE)
                .sourceObjectTypeId("sourceObjectTypeId")
                .sourcePropertyName("sourcePropertyName")
                .conditionalExpression(JsonValue.from(mapOf<String, Any>()))
                .conditionalFormula("conditionalFormula")
                .emptyRollupValue("emptyRollupValue")
                .sourceCompareByPropertyName("sourceCompareByPropertyName")
                .build()

        val roundtrippedRollupExpression =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rollupExpression),
                jacksonTypeRef<RollupExpression>(),
            )

        assertThat(roundtrippedRollupExpression).isEqualTo(rollupExpression)
    }
}
