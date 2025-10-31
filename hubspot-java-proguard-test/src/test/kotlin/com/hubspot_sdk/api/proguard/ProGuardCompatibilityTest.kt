// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.AbTestCreateRequestVNext
import com.hubspot_sdk.api.models.PublicAndFilterBranch
import com.hubspot_sdk.api.models.PublicAssociationFilterBranch
import com.hubspot_sdk.api.models.PublicBoolPropertyOperation
import com.hubspot_sdk.api.models.PublicNotAllFilterBranch
import com.hubspot_sdk.api.models.PublicNotAnyFilterBranch
import com.hubspot_sdk.api.models.PublicNumOccurrencesRefineBy
import com.hubspot_sdk.api.models.PublicOrFilterBranch
import com.hubspot_sdk.api.models.PublicPropertyAssociationFilterBranch
import com.hubspot_sdk.api.models.PublicPropertyFilter
import com.hubspot_sdk.api.models.PublicRestrictedFilterBranch
import com.hubspot_sdk.api.models.PublicUnifiedEventsFilterBranch
import com.hubspot_sdk.api.models.automation.workflows.ApiActionDataValue
import com.hubspot_sdk.api.models.automation.workflows.ApiAssociationDataSource
import com.hubspot_sdk.api.models.automation.workflows.ApiBlockedDate
import com.hubspot_sdk.api.models.automation.workflows.ApiConnection
import com.hubspot_sdk.api.models.automation.workflows.ApiContactFlow
import com.hubspot_sdk.api.models.automation.workflows.ApiContactPropertyAnchor
import com.hubspot_sdk.api.models.automation.workflows.ApiDailyEnrollmentSchedule
import com.hubspot_sdk.api.models.automation.workflows.ApiFlow
import com.hubspot_sdk.api.models.automation.workflows.ApiListBasedEnrollmentCriteria
import com.hubspot_sdk.api.models.automation.workflows.ApiSort
import com.hubspot_sdk.api.models.automation.workflows.ApiStaticBranch
import com.hubspot_sdk.api.models.automation.workflows.ApiStaticBranchAction
import com.hubspot_sdk.api.models.automation.workflows.ApiTimeOfDay
import com.hubspot_sdk.api.models.automation.workflows.ApiTimeWindow
import com.hubspot_sdk.api.models.automation.workflows.ApiUnEnrollmentSetting
import java.time.OffsetDateTime
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream("META-INF/proguard/hubspot-java-core.pro")

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()

        assertThat(client).isNotNull()
        assertThat(client.account()).isNotNull()
        assertThat(client.auth()).isNotNull()
        assertThat(client.automation()).isNotNull()
        assertThat(client.businessUnits()).isNotNull()
        assertThat(client.cms()).isNotNull()
        assertThat(client.conversations()).isNotNull()
        assertThat(client.crm()).isNotNull()
        assertThat(client.events()).isNotNull()
        assertThat(client.files()).isNotNull()
        assertThat(client.marketing()).isNotNull()
        assertThat(client.scheduler()).isNotNull()
        assertThat(client.settings()).isNotNull()
        assertThat(client.webhooks()).isNotNull()
    }

    @Test
    fun abTestCreateRequestVNextRoundtrip() {
        val jsonMapper = jsonMapper()
        val abTestCreateRequestVNext =
            AbTestCreateRequestVNext.builder()
                .contentId("contentId")
                .variationName("variationName")
                .build()

        val roundtrippedAbTestCreateRequestVNext =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(abTestCreateRequestVNext),
                jacksonTypeRef<AbTestCreateRequestVNext>(),
            )

        assertThat(roundtrippedAbTestCreateRequestVNext).isEqualTo(abTestCreateRequestVNext)
    }

    @Test
    fun apiFlowRoundtrip() {
        val jsonMapper = jsonMapper()
        val apiFlow =
            ApiFlow.ofContact(
                ApiContactFlow.builder()
                    .id("id")
                    .addAction(
                        ApiStaticBranchAction.builder()
                            .actionId("actionId")
                            .inputValue(
                                ApiActionDataValue.builder()
                                    .actionId("actionId")
                                    .dataKey("dataKey")
                                    .type(ApiActionDataValue.Type.FIELD_DATA)
                                    .build()
                            )
                            .addStaticBranch(
                                ApiStaticBranch.builder()
                                    .branchValue("branchValue")
                                    .connection(
                                        ApiConnection.builder()
                                            .edgeType("edgeType")
                                            .nextActionId("nextActionId")
                                            .build()
                                    )
                                    .build()
                            )
                            .type(ApiStaticBranchAction.Type.STATIC_BRANCH)
                            .defaultBranch(
                                ApiConnection.builder()
                                    .edgeType("edgeType")
                                    .nextActionId("nextActionId")
                                    .build()
                            )
                            .defaultBranchName("defaultBranchName")
                            .build()
                    )
                    .addBlockedDate(
                        ApiBlockedDate.builder()
                            .dayOfMonth(0)
                            .month(ApiBlockedDate.Month.JANUARY)
                            .year(0)
                            .build()
                    )
                    .canEnrollFromSalesforce(true)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .crmObjectCreationStatus(ApiContactFlow.CrmObjectCreationStatus.PENDING)
                    .customProperties(
                        ApiContactFlow.CustomProperties.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .addDataSource(
                        ApiAssociationDataSource.builder()
                            .associationCategory(
                                ApiAssociationDataSource.AssociationCategory.HUBSPOT_DEFINED
                            )
                            .associationTypeId(0)
                            .name("name")
                            .objectTypeId("objectTypeId")
                            .type(ApiAssociationDataSource.Type.ASSOCIATION)
                            .sortBy(
                                ApiSort.builder()
                                    .order(ApiSort.Order.ASC)
                                    .property("property")
                                    .missing("missing")
                                    .build()
                            )
                            .build()
                    )
                    .flowType(ApiContactFlow.FlowType.WORKFLOW)
                    .isEnabled(true)
                    .nextAvailableActionId("nextAvailableActionId")
                    .objectTypeId("objectTypeId")
                    .revisionId("revisionId")
                    .addSuppressionListId(0)
                    .addTimeWindow(
                        ApiTimeWindow.builder()
                            .day(ApiTimeWindow.Day.MONDAY)
                            .endTime(ApiTimeOfDay.builder().hour(0).minute(0).build())
                            .startTime(ApiTimeOfDay.builder().hour(0).minute(0).build())
                            .build()
                    )
                    .type(ApiContactFlow.Type.CONTACT_FLOW)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .description("description")
                    .enrollmentCriteria(
                        ApiListBasedEnrollmentCriteria.builder()
                            .listFilterBranch(
                                PublicOrFilterBranch.builder()
                                    .addFilterBranch(
                                        PublicAndFilterBranch.builder()
                                            .addFilterBranch(
                                                PublicNotAllFilterBranch.builder()
                                                    .addFilterBranch(
                                                        PublicNotAnyFilterBranch.builder()
                                                            .addFilterBranch(
                                                                PublicRestrictedFilterBranch
                                                                    .builder()
                                                                    .addFilterBranch(
                                                                        PublicUnifiedEventsFilterBranch
                                                                            .builder()
                                                                            .eventTypeId(
                                                                                "eventTypeId"
                                                                            )
                                                                            .addFilterBranch(
                                                                                PublicPropertyAssociationFilterBranch
                                                                                    .builder()
                                                                                    .addFilterBranch(
                                                                                        PublicAssociationFilterBranch
                                                                                            .builder()
                                                                                            .associationCategory(
                                                                                                "associationCategory"
                                                                                            )
                                                                                            .associationTypeId(
                                                                                                0
                                                                                            )
                                                                                            .addFilterBranch(
                                                                                                PublicOrFilterBranch
                                                                                                    .builder()
                                                                                                    .filterBranches(
                                                                                                        listOf()
                                                                                                    )
                                                                                                    .filterBranchOperator(
                                                                                                        "filterBranchOperator"
                                                                                                    )
                                                                                                    .filterBranchType(
                                                                                                        PublicOrFilterBranch
                                                                                                            .FilterBranchType
                                                                                                            .OR
                                                                                                    )
                                                                                                    .addFilter(
                                                                                                        PublicPropertyFilter
                                                                                                            .builder()
                                                                                                            .filterType(
                                                                                                                PublicPropertyFilter
                                                                                                                    .FilterType
                                                                                                                    .PROPERTY
                                                                                                            )
                                                                                                            .operation(
                                                                                                                PublicBoolPropertyOperation
                                                                                                                    .builder()
                                                                                                                    .includeObjectsWithNoValueSet(
                                                                                                                        true
                                                                                                                    )
                                                                                                                    .operationType(
                                                                                                                        PublicBoolPropertyOperation
                                                                                                                            .OperationType
                                                                                                                            .BOOL
                                                                                                                    )
                                                                                                                    .operator(
                                                                                                                        "operator"
                                                                                                                    )
                                                                                                                    .value(
                                                                                                                        true
                                                                                                                    )
                                                                                                                    .build()
                                                                                                            )
                                                                                                            .property(
                                                                                                                "property"
                                                                                                            )
                                                                                                            .build()
                                                                                                    )
                                                                                                    .build()
                                                                                            )
                                                                                            .filterBranchOperator(
                                                                                                "filterBranchOperator"
                                                                                            )
                                                                                            .filterBranchType(
                                                                                                PublicAssociationFilterBranch
                                                                                                    .FilterBranchType
                                                                                                    .ASSOCIATION
                                                                                            )
                                                                                            .addFilter(
                                                                                                PublicPropertyFilter
                                                                                                    .builder()
                                                                                                    .filterType(
                                                                                                        PublicPropertyFilter
                                                                                                            .FilterType
                                                                                                            .PROPERTY
                                                                                                    )
                                                                                                    .operation(
                                                                                                        PublicBoolPropertyOperation
                                                                                                            .builder()
                                                                                                            .includeObjectsWithNoValueSet(
                                                                                                                true
                                                                                                            )
                                                                                                            .operationType(
                                                                                                                PublicBoolPropertyOperation
                                                                                                                    .OperationType
                                                                                                                    .BOOL
                                                                                                            )
                                                                                                            .operator(
                                                                                                                "operator"
                                                                                                            )
                                                                                                            .value(
                                                                                                                true
                                                                                                            )
                                                                                                            .build()
                                                                                                    )
                                                                                                    .property(
                                                                                                        "property"
                                                                                                    )
                                                                                                    .build()
                                                                                            )
                                                                                            .objectTypeId(
                                                                                                "objectTypeId"
                                                                                            )
                                                                                            .operator(
                                                                                                "operator"
                                                                                            )
                                                                                            .build()
                                                                                    )
                                                                                    .filterBranchOperator(
                                                                                        "filterBranchOperator"
                                                                                    )
                                                                                    .filterBranchType(
                                                                                        PublicPropertyAssociationFilterBranch
                                                                                            .FilterBranchType
                                                                                            .PROPERTY_ASSOCIATION
                                                                                    )
                                                                                    .addFilter(
                                                                                        PublicPropertyFilter
                                                                                            .builder()
                                                                                            .filterType(
                                                                                                PublicPropertyFilter
                                                                                                    .FilterType
                                                                                                    .PROPERTY
                                                                                            )
                                                                                            .operation(
                                                                                                PublicBoolPropertyOperation
                                                                                                    .builder()
                                                                                                    .includeObjectsWithNoValueSet(
                                                                                                        true
                                                                                                    )
                                                                                                    .operationType(
                                                                                                        PublicBoolPropertyOperation
                                                                                                            .OperationType
                                                                                                            .BOOL
                                                                                                    )
                                                                                                    .operator(
                                                                                                        "operator"
                                                                                                    )
                                                                                                    .value(
                                                                                                        true
                                                                                                    )
                                                                                                    .build()
                                                                                            )
                                                                                            .property(
                                                                                                "property"
                                                                                            )
                                                                                            .build()
                                                                                    )
                                                                                    .objectTypeId(
                                                                                        "objectTypeId"
                                                                                    )
                                                                                    .operator(
                                                                                        "operator"
                                                                                    )
                                                                                    .propertyWithObjectId(
                                                                                        "propertyWithObjectId"
                                                                                    )
                                                                                    .build()
                                                                            )
                                                                            .filterBranchOperator(
                                                                                "filterBranchOperator"
                                                                            )
                                                                            .filterBranchType(
                                                                                PublicUnifiedEventsFilterBranch
                                                                                    .FilterBranchType
                                                                                    .UNIFIED_EVENTS
                                                                            )
                                                                            .addFilter(
                                                                                PublicPropertyFilter
                                                                                    .builder()
                                                                                    .filterType(
                                                                                        PublicPropertyFilter
                                                                                            .FilterType
                                                                                            .PROPERTY
                                                                                    )
                                                                                    .operation(
                                                                                        PublicBoolPropertyOperation
                                                                                            .builder()
                                                                                            .includeObjectsWithNoValueSet(
                                                                                                true
                                                                                            )
                                                                                            .operationType(
                                                                                                PublicBoolPropertyOperation
                                                                                                    .OperationType
                                                                                                    .BOOL
                                                                                            )
                                                                                            .operator(
                                                                                                "operator"
                                                                                            )
                                                                                            .value(
                                                                                                true
                                                                                            )
                                                                                            .build()
                                                                                    )
                                                                                    .property(
                                                                                        "property"
                                                                                    )
                                                                                    .build()
                                                                            )
                                                                            .operator(
                                                                                PublicUnifiedEventsFilterBranch
                                                                                    .Operator
                                                                                    .HAS_COMPLETED
                                                                            )
                                                                            .coalescingRefineBy(
                                                                                PublicNumOccurrencesRefineBy
                                                                                    .builder()
                                                                                    .type(
                                                                                        PublicNumOccurrencesRefineBy
                                                                                            .Type
                                                                                            .NUM_OCCURRENCES
                                                                                    )
                                                                                    .maxOccurrences(
                                                                                        0
                                                                                    )
                                                                                    .minOccurrences(
                                                                                        0
                                                                                    )
                                                                                    .build()
                                                                            )
                                                                            .build()
                                                                    )
                                                                    .filterBranchOperator(
                                                                        "filterBranchOperator"
                                                                    )
                                                                    .filterBranchType(
                                                                        PublicRestrictedFilterBranch
                                                                            .FilterBranchType
                                                                            .RESTRICTED
                                                                    )
                                                                    .addFilter(
                                                                        PublicPropertyFilter
                                                                            .builder()
                                                                            .filterType(
                                                                                PublicPropertyFilter
                                                                                    .FilterType
                                                                                    .PROPERTY
                                                                            )
                                                                            .operation(
                                                                                PublicBoolPropertyOperation
                                                                                    .builder()
                                                                                    .includeObjectsWithNoValueSet(
                                                                                        true
                                                                                    )
                                                                                    .operationType(
                                                                                        PublicBoolPropertyOperation
                                                                                            .OperationType
                                                                                            .BOOL
                                                                                    )
                                                                                    .operator(
                                                                                        "operator"
                                                                                    )
                                                                                    .value(true)
                                                                                    .build()
                                                                            )
                                                                            .property("property")
                                                                            .build()
                                                                    )
                                                                    .build()
                                                            )
                                                            .filterBranchOperator(
                                                                "filterBranchOperator"
                                                            )
                                                            .filterBranchType(
                                                                PublicNotAnyFilterBranch
                                                                    .FilterBranchType
                                                                    .NOT_ANY
                                                            )
                                                            .addFilter(
                                                                PublicPropertyFilter.builder()
                                                                    .filterType(
                                                                        PublicPropertyFilter
                                                                            .FilterType
                                                                            .PROPERTY
                                                                    )
                                                                    .operation(
                                                                        PublicBoolPropertyOperation
                                                                            .builder()
                                                                            .includeObjectsWithNoValueSet(
                                                                                true
                                                                            )
                                                                            .operationType(
                                                                                PublicBoolPropertyOperation
                                                                                    .OperationType
                                                                                    .BOOL
                                                                            )
                                                                            .operator("operator")
                                                                            .value(true)
                                                                            .build()
                                                                    )
                                                                    .property("property")
                                                                    .build()
                                                            )
                                                            .build()
                                                    )
                                                    .filterBranchOperator("filterBranchOperator")
                                                    .filterBranchType(
                                                        PublicNotAllFilterBranch.FilterBranchType
                                                            .NOT_ALL
                                                    )
                                                    .addFilter(
                                                        PublicPropertyFilter.builder()
                                                            .filterType(
                                                                PublicPropertyFilter.FilterType
                                                                    .PROPERTY
                                                            )
                                                            .operation(
                                                                PublicBoolPropertyOperation
                                                                    .builder()
                                                                    .includeObjectsWithNoValueSet(
                                                                        true
                                                                    )
                                                                    .operationType(
                                                                        PublicBoolPropertyOperation
                                                                            .OperationType
                                                                            .BOOL
                                                                    )
                                                                    .operator("operator")
                                                                    .value(true)
                                                                    .build()
                                                            )
                                                            .property("property")
                                                            .build()
                                                    )
                                                    .build()
                                            )
                                            .filterBranchOperator("filterBranchOperator")
                                            .filterBranchType(
                                                PublicAndFilterBranch.FilterBranchType.AND
                                            )
                                            .addFilter(
                                                PublicPropertyFilter.builder()
                                                    .filterType(
                                                        PublicPropertyFilter.FilterType.PROPERTY
                                                    )
                                                    .operation(
                                                        PublicBoolPropertyOperation.builder()
                                                            .includeObjectsWithNoValueSet(true)
                                                            .operationType(
                                                                PublicBoolPropertyOperation
                                                                    .OperationType
                                                                    .BOOL
                                                            )
                                                            .operator("operator")
                                                            .value(true)
                                                            .build()
                                                    )
                                                    .property("property")
                                                    .build()
                                            )
                                            .build()
                                    )
                                    .filterBranchOperator("filterBranchOperator")
                                    .filterBranchType(PublicOrFilterBranch.FilterBranchType.OR)
                                    .addFilter(
                                        PublicPropertyFilter.builder()
                                            .filterType(PublicPropertyFilter.FilterType.PROPERTY)
                                            .operation(
                                                PublicBoolPropertyOperation.builder()
                                                    .includeObjectsWithNoValueSet(true)
                                                    .operationType(
                                                        PublicBoolPropertyOperation.OperationType
                                                            .BOOL
                                                    )
                                                    .operator("operator")
                                                    .value(true)
                                                    .build()
                                            )
                                            .property("property")
                                            .build()
                                    )
                                    .build()
                            )
                            .addReEnrollmentTriggersFilterBranch(
                                PublicOrFilterBranch.builder()
                                    .filterBranches(listOf())
                                    .filterBranchOperator("filterBranchOperator")
                                    .filterBranchType(PublicOrFilterBranch.FilterBranchType.OR)
                                    .addFilter(
                                        PublicPropertyFilter.builder()
                                            .filterType(PublicPropertyFilter.FilterType.PROPERTY)
                                            .operation(
                                                PublicBoolPropertyOperation.builder()
                                                    .includeObjectsWithNoValueSet(true)
                                                    .operationType(
                                                        PublicBoolPropertyOperation.OperationType
                                                            .BOOL
                                                    )
                                                    .operator("operator")
                                                    .value(true)
                                                    .build()
                                            )
                                            .property("property")
                                            .build()
                                    )
                                    .build()
                            )
                            .shouldReEnroll(true)
                            .type(ApiListBasedEnrollmentCriteria.Type.LIST_BASED)
                            .unEnrollObjectsNotMeetingCriteria(true)
                            .build()
                    )
                    .enrollmentSchedule(
                        ApiDailyEnrollmentSchedule.builder()
                            .timeOfDay(ApiTimeOfDay.builder().hour(0).minute(0).build())
                            .type(ApiDailyEnrollmentSchedule.Type.DAILY)
                            .build()
                    )
                    .eventAnchor(
                        ApiContactPropertyAnchor.builder()
                            .contactProperty("contactProperty")
                            .type(ApiContactPropertyAnchor.Type.CONTACT_PROPERTY_ANCHOR)
                            .build()
                    )
                    .goalFilterBranch(
                        PublicOrFilterBranch.builder()
                            .filterBranches(listOf())
                            .filterBranchOperator("filterBranchOperator")
                            .filterBranchType(PublicOrFilterBranch.FilterBranchType.OR)
                            .addFilter(
                                PublicPropertyFilter.builder()
                                    .filterType(PublicPropertyFilter.FilterType.PROPERTY)
                                    .operation(
                                        PublicBoolPropertyOperation.builder()
                                            .includeObjectsWithNoValueSet(true)
                                            .operationType(
                                                PublicBoolPropertyOperation.OperationType.BOOL
                                            )
                                            .operator("operator")
                                            .value(true)
                                            .build()
                                    )
                                    .property("property")
                                    .build()
                            )
                            .build()
                    )
                    .name("name")
                    .startActionId("startActionId")
                    .unEnrollmentSetting(
                        ApiUnEnrollmentSetting.builder()
                            .addFlowId("string")
                            .type(ApiUnEnrollmentSetting.Type.ALL)
                            .build()
                    )
                    .uuid("uuid")
                    .build()
            )

        val roundtrippedApiFlow =
            jsonMapper.readValue(jsonMapper.writeValueAsString(apiFlow), jacksonTypeRef<ApiFlow>())

        assertThat(roundtrippedApiFlow).isEqualTo(apiFlow)
    }
}
