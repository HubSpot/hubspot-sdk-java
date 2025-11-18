// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.PublicAndFilterBranch
import com.hubspot_sdk.api.models.PublicAssociationFilterBranch
import com.hubspot_sdk.api.models.PublicBoolPropertyOperation
import com.hubspot_sdk.api.models.PublicEmailSubscriptionFilter
import com.hubspot_sdk.api.models.PublicNotAllFilterBranch
import com.hubspot_sdk.api.models.PublicNotAnyFilterBranch
import com.hubspot_sdk.api.models.PublicNumOccurrencesRefineBy
import com.hubspot_sdk.api.models.PublicOrFilterBranch
import com.hubspot_sdk.api.models.PublicPropertyAssociationFilterBranch
import com.hubspot_sdk.api.models.PublicPropertyFilter
import com.hubspot_sdk.api.models.PublicRestrictedFilterBranch
import com.hubspot_sdk.api.models.PublicUnifiedEventsFilterBranch
import com.hubspot_sdk.api.models.crm.lists.ListCreateRequest
import com.hubspot_sdk.api.models.crm.lists.ListFilterUpdateRequest
import com.hubspot_sdk.api.models.crm.lists.ListGetByObjectTypeIdAndNameParams
import com.hubspot_sdk.api.models.crm.lists.ListGetParams
import com.hubspot_sdk.api.models.crm.lists.ListListParams
import com.hubspot_sdk.api.models.crm.lists.ListScheduleConversionParams
import com.hubspot_sdk.api.models.crm.lists.ListSearchRequest
import com.hubspot_sdk.api.models.crm.lists.ListUpdateFiltersParams
import com.hubspot_sdk.api.models.crm.lists.ListUpdateNameParams
import com.hubspot_sdk.api.models.crm.lists.PublicListConversionDate
import com.hubspot_sdk.api.models.crm.lists.PublicListPermissions
import com.hubspot_sdk.api.models.crm.lists.PublicMembershipSettings
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ListServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val listService = client.crm().lists()

        val listCreateResponse =
            listService.create(
                ListCreateRequest.builder()
                    .name("Dynamic Association List Example")
                    .objectTypeId("0-1")
                    .processingType("DYNAMIC")
                    .customProperties(
                        ListCreateRequest.CustomProperties.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .filterBranch(
                        PublicOrFilterBranch.builder()
                            .addFilterBranch(
                                PublicAndFilterBranch.builder()
                                    .addFilterBranch(
                                        PublicNotAllFilterBranch.builder()
                                            .addFilterBranch(
                                                PublicNotAnyFilterBranch.builder()
                                                    .addFilterBranch(
                                                        PublicRestrictedFilterBranch.builder()
                                                            .addFilterBranch(
                                                                PublicUnifiedEventsFilterBranch
                                                                    .builder()
                                                                    .eventTypeId("eventTypeId")
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
                                                                            .operator("operator")
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
                                                                                    .value(true)
                                                                                    .build()
                                                                            )
                                                                            .property("property")
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
                                                                            .maxOccurrences(0)
                                                                            .minOccurrences(0)
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
                                                        PublicNotAnyFilterBranch.FilterBranchType
                                                            .NOT_ANY
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
                                                PublicNotAllFilterBranch.FilterBranchType.NOT_ALL
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
                                                            .operator("IS_EQUAL_TO")
                                                            .value(true)
                                                            .build()
                                                    )
                                                    .property("hs_is_closed_won")
                                                    .build()
                                            )
                                            .build()
                                    )
                                    .filterBranchOperator("filterBranchOperator")
                                    .filterBranchType(PublicAndFilterBranch.FilterBranchType.AND)
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
                                                    .operator("IS_EQUAL_TO")
                                                    .value(true)
                                                    .build()
                                            )
                                            .property("firstname")
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
                    .listFolderId(0)
                    .listPermissions(
                        PublicListPermissions.builder()
                            .addTeamsWithEditAccess(0)
                            .addUsersWithEditAccess(0)
                            .build()
                    )
                    .membershipSettings(
                        PublicMembershipSettings.builder()
                            .includeUnassigned(true)
                            .membershipTeamId(0)
                            .build()
                    )
                    .build()
            )

        listCreateResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val listService = client.crm().lists()

        val listsByIdResponse =
            listService.list(
                ListListParams.builder().includeFilters(true).addListId("string").build()
            )

        listsByIdResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val listService = client.crm().lists()

        listService.delete("listId")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteScheduleConversion() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val listService = client.crm().lists()

        listService.deleteScheduleConversion("listId")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val listService = client.crm().lists()

        val listFetchResponse =
            listService.get(ListGetParams.builder().listId("listId").includeFilters(true).build())

        listFetchResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getByObjectTypeIdAndName() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val listService = client.crm().lists()

        val listFetchResponse =
            listService.getByObjectTypeIdAndName(
                ListGetByObjectTypeIdAndNameParams.builder()
                    .objectTypeId("objectTypeId")
                    .listName("listName")
                    .includeFilters(true)
                    .build()
            )

        listFetchResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getScheduleConversion() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val listService = client.crm().lists()

        val publicListConversionResponse = listService.getScheduleConversion("listId")

        publicListConversionResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun restore() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val listService = client.crm().lists()

        listService.restore("listId")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun scheduleConversion() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val listService = client.crm().lists()

        val publicListConversionResponse =
            listService.scheduleConversion(
                ListScheduleConversionParams.builder()
                    .listId("listId")
                    .publicListConversionTime(
                        PublicListConversionDate.builder()
                            .conversionType(PublicListConversionDate.ConversionType.CONVERSION_DATE)
                            .day(0)
                            .month(0)
                            .year(0)
                            .build()
                    )
                    .build()
            )

        publicListConversionResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun search() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val listService = client.crm().lists()

        val listSearchResponse =
            listService.search(
                ListSearchRequest.builder()
                    .addAdditionalProperty("hs_list_size_week_delta")
                    .offset(0)
                    .count(100)
                    .addListId("string")
                    .addProcessingType("string")
                    .query("Test")
                    .sort("sort")
                    .build()
            )

        listSearchResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateFilters() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val listService = client.crm().lists()

        val listUpdateResponse =
            listService.updateFilters(
                ListUpdateFiltersParams.builder()
                    .listId("listId")
                    .enrollObjectsInWorkflows(true)
                    .listFilterUpdateRequest(
                        ListFilterUpdateRequest.builder()
                            .filterBranch(
                                PublicOrFilterBranch.builder()
                                    .addFilterBranch(
                                        PublicOrFilterBranch.builder()
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
                                            .filterBranchType(JsonValue.from("AND"))
                                            .filters(
                                                listOf(
                                                    PublicOrFilterBranch.Filter.ofPublicProperty(
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
                                                                    .operator(
                                                                        "IS_GREATER_THAN_OR_EQUAL_TO"
                                                                    )
                                                                    .value(true)
                                                                    .build()
                                                            )
                                                            .property(
                                                                "hs_predictivecontactscore_v2"
                                                            )
                                                            .build()
                                                    ),
                                                    PublicOrFilterBranch.Filter.ofPublicProperty(
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
                                                                    .operator("IS_UNKNOWN")
                                                                    .value(true)
                                                                    .build()
                                                            )
                                                            .property(
                                                                "engagements_last_meeting_booked_source"
                                                            )
                                                            .build()
                                                    ),
                                                    PublicOrFilterBranch.Filter
                                                        .ofPublicEmailSubscription(
                                                            PublicEmailSubscriptionFilter.builder()
                                                                .addAcceptedStatus("OPT_IN")
                                                                .filterType(
                                                                    PublicEmailSubscriptionFilter
                                                                        .FilterType
                                                                        .EMAIL_SUBSCRIPTION
                                                                )
                                                                .addSubscriptionId("81537745")
                                                                .addSubscriptionId("321981152")
                                                                .subscriptionType(
                                                                    "subscriptionType"
                                                                )
                                                                .build()
                                                        ),
                                                )
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
                            .build()
                    )
                    .build()
            )

        listUpdateResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateName() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val listService = client.crm().lists()

        val listUpdateResponse =
            listService.updateName(
                ListUpdateNameParams.builder()
                    .listId("listId")
                    .includeFilters(true)
                    .listName("listName")
                    .build()
            )

        listUpdateResponse.validate()
    }
}
