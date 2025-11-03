// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.ErrorDetail
import com.hubspot_sdk.api.models.Option
import com.hubspot_sdk.api.models.Property
import com.hubspot_sdk.api.models.PropertyModificationMetadata
import com.hubspot_sdk.api.models.StandardError
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchResponsePropertyWithErrorsTest {

    @Test
    fun create() {
        val batchResponsePropertyWithErrors =
            BatchResponsePropertyWithErrors.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    Property.builder()
                        .description("")
                        .fieldType("select")
                        .groupName("my_object_information")
                        .label("My object property")
                        .name("my_object_property")
                        .addOption(
                            Option.builder()
                                .hidden(false)
                                .label("Option A")
                                .value("A")
                                .description("Choice number one")
                                .displayOrder(1)
                                .build()
                        )
                        .addOption(
                            Option.builder()
                                .hidden(false)
                                .label("Option B")
                                .value("B")
                                .description("Choice number two")
                                .displayOrder(2)
                                .build()
                        )
                        .type("enumeration")
                        .archived(false)
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .calculated(false)
                        .calculationFormula("")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdUserId("")
                        .dataSensitivity(Property.DataSensitivity.NON_SENSITIVE)
                        .displayOrder(2)
                        .externalOptions(false)
                        .formField(false)
                        .hasUniqueValue(false)
                        .hidden(false)
                        .hubspotDefined(false)
                        .modificationMetadata(
                            PropertyModificationMetadata.builder()
                                .archivable(true)
                                .readOnlyDefinition(false)
                                .readOnlyValue(false)
                                .readOnlyOptions(false)
                                .build()
                        )
                        .referencedObjectType("")
                        .addSensitiveDataCategory("string")
                        .showCurrencySymbol(false)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedUserId("updatedUserId")
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponsePropertyWithErrors.Status.PENDING)
                .addError(
                    StandardError.builder()
                        .category("")
                        .context(
                            StandardError.Context.builder()
                                .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                                .build()
                        )
                        .addError(
                            ErrorDetail.builder()
                                .message("message")
                                .code("code")
                                .context(
                                    ErrorDetail.Context.builder()
                                        .putAdditionalProperty(
                                            "missingScopes",
                                            JsonValue.from(listOf("scope1", "scope2")),
                                        )
                                        .build()
                                )
                                .in_("in")
                                .subCategory("subCategory")
                                .build()
                        )
                        .links(
                            StandardError.Links.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .message("")
                        .status("")
                        .id("")
                        .subCategory(JsonValue.from(""))
                        .build()
                )
                .links(
                    BatchResponsePropertyWithErrors.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .numErrors(0)
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(batchResponsePropertyWithErrors.completedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponsePropertyWithErrors.results())
            .containsExactly(
                Property.builder()
                    .description("")
                    .fieldType("select")
                    .groupName("my_object_information")
                    .label("My object property")
                    .name("my_object_property")
                    .addOption(
                        Option.builder()
                            .hidden(false)
                            .label("Option A")
                            .value("A")
                            .description("Choice number one")
                            .displayOrder(1)
                            .build()
                    )
                    .addOption(
                        Option.builder()
                            .hidden(false)
                            .label("Option B")
                            .value("B")
                            .description("Choice number two")
                            .displayOrder(2)
                            .build()
                    )
                    .type("enumeration")
                    .archived(false)
                    .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .calculated(false)
                    .calculationFormula("")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .createdUserId("")
                    .dataSensitivity(Property.DataSensitivity.NON_SENSITIVE)
                    .displayOrder(2)
                    .externalOptions(false)
                    .formField(false)
                    .hasUniqueValue(false)
                    .hidden(false)
                    .hubspotDefined(false)
                    .modificationMetadata(
                        PropertyModificationMetadata.builder()
                            .archivable(true)
                            .readOnlyDefinition(false)
                            .readOnlyValue(false)
                            .readOnlyOptions(false)
                            .build()
                    )
                    .referencedObjectType("")
                    .addSensitiveDataCategory("string")
                    .showCurrencySymbol(false)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .updatedUserId("updatedUserId")
                    .build()
            )
        assertThat(batchResponsePropertyWithErrors.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponsePropertyWithErrors.status())
            .isEqualTo(BatchResponsePropertyWithErrors.Status.PENDING)
        assertThat(batchResponsePropertyWithErrors.errors().getOrNull())
            .containsExactly(
                StandardError.builder()
                    .category("")
                    .context(
                        StandardError.Context.builder()
                            .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                            .build()
                    )
                    .addError(
                        ErrorDetail.builder()
                            .message("message")
                            .code("code")
                            .context(
                                ErrorDetail.Context.builder()
                                    .putAdditionalProperty(
                                        "missingScopes",
                                        JsonValue.from(listOf("scope1", "scope2")),
                                    )
                                    .build()
                            )
                            .in_("in")
                            .subCategory("subCategory")
                            .build()
                    )
                    .links(
                        StandardError.Links.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .message("")
                    .status("")
                    .id("")
                    .subCategory(JsonValue.from(""))
                    .build()
            )
        assertThat(batchResponsePropertyWithErrors.links())
            .contains(
                BatchResponsePropertyWithErrors.Links.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(batchResponsePropertyWithErrors.numErrors()).contains(0)
        assertThat(batchResponsePropertyWithErrors.requestedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchResponsePropertyWithErrors =
            BatchResponsePropertyWithErrors.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    Property.builder()
                        .description("")
                        .fieldType("select")
                        .groupName("my_object_information")
                        .label("My object property")
                        .name("my_object_property")
                        .addOption(
                            Option.builder()
                                .hidden(false)
                                .label("Option A")
                                .value("A")
                                .description("Choice number one")
                                .displayOrder(1)
                                .build()
                        )
                        .addOption(
                            Option.builder()
                                .hidden(false)
                                .label("Option B")
                                .value("B")
                                .description("Choice number two")
                                .displayOrder(2)
                                .build()
                        )
                        .type("enumeration")
                        .archived(false)
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .calculated(false)
                        .calculationFormula("")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdUserId("")
                        .dataSensitivity(Property.DataSensitivity.NON_SENSITIVE)
                        .displayOrder(2)
                        .externalOptions(false)
                        .formField(false)
                        .hasUniqueValue(false)
                        .hidden(false)
                        .hubspotDefined(false)
                        .modificationMetadata(
                            PropertyModificationMetadata.builder()
                                .archivable(true)
                                .readOnlyDefinition(false)
                                .readOnlyValue(false)
                                .readOnlyOptions(false)
                                .build()
                        )
                        .referencedObjectType("")
                        .addSensitiveDataCategory("string")
                        .showCurrencySymbol(false)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedUserId("updatedUserId")
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponsePropertyWithErrors.Status.PENDING)
                .addError(
                    StandardError.builder()
                        .category("")
                        .context(
                            StandardError.Context.builder()
                                .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                                .build()
                        )
                        .addError(
                            ErrorDetail.builder()
                                .message("message")
                                .code("code")
                                .context(
                                    ErrorDetail.Context.builder()
                                        .putAdditionalProperty(
                                            "missingScopes",
                                            JsonValue.from(listOf("scope1", "scope2")),
                                        )
                                        .build()
                                )
                                .in_("in")
                                .subCategory("subCategory")
                                .build()
                        )
                        .links(
                            StandardError.Links.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .message("")
                        .status("")
                        .id("")
                        .subCategory(JsonValue.from(""))
                        .build()
                )
                .links(
                    BatchResponsePropertyWithErrors.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .numErrors(0)
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedBatchResponsePropertyWithErrors =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchResponsePropertyWithErrors),
                jacksonTypeRef<BatchResponsePropertyWithErrors>(),
            )

        assertThat(roundtrippedBatchResponsePropertyWithErrors)
            .isEqualTo(batchResponsePropertyWithErrors)
    }
}
