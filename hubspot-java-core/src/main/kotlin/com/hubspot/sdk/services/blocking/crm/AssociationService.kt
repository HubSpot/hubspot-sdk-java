// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.crm

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.crm.CollectionResponseWithTotalSimplePublicObject
import com.hubspot.sdk.models.crm.LabelsBetweenObjectPair
import com.hubspot.sdk.models.crm.associations.AssociationDeleteParams
import com.hubspot.sdk.models.crm.associations.AssociationListPage
import com.hubspot.sdk.models.crm.associations.AssociationListParams
import com.hubspot.sdk.models.crm.associations.AssociationRequestHighUsageReportParams
import com.hubspot.sdk.models.crm.associations.AssociationSearchParams
import com.hubspot.sdk.models.crm.associations.AssociationUpdateAssociationLabelsParams
import com.hubspot.sdk.models.crm.associations.ReportCreationResponse
import com.hubspot.sdk.services.blocking.crm.associations.BatchService
import java.util.function.Consumer

interface AssociationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AssociationService

    fun batch(): BatchService

    /**
     * Retrieve all associations between a specific record and an object type. Limit 500 per call.
     */
    fun list(toObjectType: String, params: AssociationListParams): AssociationListPage =
        list(toObjectType, params, RequestOptions.none())

    /** @see list */
    fun list(
        toObjectType: String,
        params: AssociationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssociationListPage =
        list(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see list */
    fun list(params: AssociationListParams): AssociationListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: AssociationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssociationListPage

    fun delete(toObjectId: String, params: AssociationDeleteParams) =
        delete(toObjectId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        toObjectId: String,
        params: AssociationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().toObjectId(toObjectId).build(), requestOptions)

    /** @see delete */
    fun delete(params: AssociationDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AssociationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Requests a report of all objects in the portal which have a high usage of associations */
    fun requestHighUsageReport(userId: Int): ReportCreationResponse =
        requestHighUsageReport(userId, AssociationRequestHighUsageReportParams.none())

    /** @see requestHighUsageReport */
    fun requestHighUsageReport(
        userId: Int,
        params: AssociationRequestHighUsageReportParams =
            AssociationRequestHighUsageReportParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReportCreationResponse =
        requestHighUsageReport(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see requestHighUsageReport */
    fun requestHighUsageReport(
        userId: Int,
        params: AssociationRequestHighUsageReportParams =
            AssociationRequestHighUsageReportParams.none(),
    ): ReportCreationResponse = requestHighUsageReport(userId, params, RequestOptions.none())

    /** @see requestHighUsageReport */
    fun requestHighUsageReport(
        params: AssociationRequestHighUsageReportParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReportCreationResponse

    /** @see requestHighUsageReport */
    fun requestHighUsageReport(
        params: AssociationRequestHighUsageReportParams
    ): ReportCreationResponse = requestHighUsageReport(params, RequestOptions.none())

    /** @see requestHighUsageReport */
    fun requestHighUsageReport(
        userId: Int,
        requestOptions: RequestOptions,
    ): ReportCreationResponse =
        requestHighUsageReport(
            userId,
            AssociationRequestHighUsageReportParams.none(),
            requestOptions,
        )

    fun search(
        objectType: String,
        params: AssociationSearchParams,
    ): CollectionResponseWithTotalSimplePublicObject =
        search(objectType, params, RequestOptions.none())

    /** @see search */
    fun search(
        objectType: String,
        params: AssociationSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject =
        search(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see search */
    fun search(params: AssociationSearchParams): CollectionResponseWithTotalSimplePublicObject =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: AssociationSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject

    fun updateAssociationLabels(
        toObjectId: String,
        params: AssociationUpdateAssociationLabelsParams,
    ): LabelsBetweenObjectPair = updateAssociationLabels(toObjectId, params, RequestOptions.none())

    /** @see updateAssociationLabels */
    fun updateAssociationLabels(
        toObjectId: String,
        params: AssociationUpdateAssociationLabelsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LabelsBetweenObjectPair =
        updateAssociationLabels(params.toBuilder().toObjectId(toObjectId).build(), requestOptions)

    /** @see updateAssociationLabels */
    fun updateAssociationLabels(
        params: AssociationUpdateAssociationLabelsParams
    ): LabelsBetweenObjectPair = updateAssociationLabels(params, RequestOptions.none())

    /** @see updateAssociationLabels */
    fun updateAssociationLabels(
        params: AssociationUpdateAssociationLabelsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LabelsBetweenObjectPair

    /**
     * A view of [AssociationService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AssociationService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /crm/objects/2026-03/{objectType}/{objectId}/associations/{toObjectType}`, but is
         * otherwise the same as [AssociationService.list].
         */
        @MustBeClosed
        fun list(
            toObjectType: String,
            params: AssociationListParams,
        ): HttpResponseFor<AssociationListPage> = list(toObjectType, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            toObjectType: String,
            params: AssociationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssociationListPage> =
            list(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(params: AssociationListParams): HttpResponseFor<AssociationListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AssociationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssociationListPage>

        /**
         * Returns a raw HTTP response for `delete
         * /crm/objects/2026-03/{objectType}/{objectId}/associations/{toObjectType}/{toObjectId}`,
         * but is otherwise the same as [AssociationService.delete].
         */
        @MustBeClosed
        fun delete(toObjectId: String, params: AssociationDeleteParams): HttpResponse =
            delete(toObjectId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            toObjectId: String,
            params: AssociationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().toObjectId(toObjectId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: AssociationDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: AssociationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post
         * /crm/associations/2026-03/usage/high-usage-report/{userId}`, but is otherwise the same as
         * [AssociationService.requestHighUsageReport].
         */
        @MustBeClosed
        fun requestHighUsageReport(userId: Int): HttpResponseFor<ReportCreationResponse> =
            requestHighUsageReport(userId, AssociationRequestHighUsageReportParams.none())

        /** @see requestHighUsageReport */
        @MustBeClosed
        fun requestHighUsageReport(
            userId: Int,
            params: AssociationRequestHighUsageReportParams =
                AssociationRequestHighUsageReportParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReportCreationResponse> =
            requestHighUsageReport(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see requestHighUsageReport */
        @MustBeClosed
        fun requestHighUsageReport(
            userId: Int,
            params: AssociationRequestHighUsageReportParams =
                AssociationRequestHighUsageReportParams.none(),
        ): HttpResponseFor<ReportCreationResponse> =
            requestHighUsageReport(userId, params, RequestOptions.none())

        /** @see requestHighUsageReport */
        @MustBeClosed
        fun requestHighUsageReport(
            params: AssociationRequestHighUsageReportParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReportCreationResponse>

        /** @see requestHighUsageReport */
        @MustBeClosed
        fun requestHighUsageReport(
            params: AssociationRequestHighUsageReportParams
        ): HttpResponseFor<ReportCreationResponse> =
            requestHighUsageReport(params, RequestOptions.none())

        /** @see requestHighUsageReport */
        @MustBeClosed
        fun requestHighUsageReport(
            userId: Int,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ReportCreationResponse> =
            requestHighUsageReport(
                userId,
                AssociationRequestHighUsageReportParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/{objectType}/search`, but is
         * otherwise the same as [AssociationService.search].
         */
        @MustBeClosed
        fun search(
            objectType: String,
            params: AssociationSearchParams,
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(objectType, params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            objectType: String,
            params: AssociationSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see search */
        @MustBeClosed
        fun search(
            params: AssociationSearchParams
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: AssociationSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>

        /**
         * Returns a raw HTTP response for `put
         * /crm/objects/2026-03/{objectType}/{objectId}/associations/{toObjectType}/{toObjectId}`,
         * but is otherwise the same as [AssociationService.updateAssociationLabels].
         */
        @MustBeClosed
        fun updateAssociationLabels(
            toObjectId: String,
            params: AssociationUpdateAssociationLabelsParams,
        ): HttpResponseFor<LabelsBetweenObjectPair> =
            updateAssociationLabels(toObjectId, params, RequestOptions.none())

        /** @see updateAssociationLabels */
        @MustBeClosed
        fun updateAssociationLabels(
            toObjectId: String,
            params: AssociationUpdateAssociationLabelsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LabelsBetweenObjectPair> =
            updateAssociationLabels(
                params.toBuilder().toObjectId(toObjectId).build(),
                requestOptions,
            )

        /** @see updateAssociationLabels */
        @MustBeClosed
        fun updateAssociationLabels(
            params: AssociationUpdateAssociationLabelsParams
        ): HttpResponseFor<LabelsBetweenObjectPair> =
            updateAssociationLabels(params, RequestOptions.none())

        /** @see updateAssociationLabels */
        @MustBeClosed
        fun updateAssociationLabels(
            params: AssociationUpdateAssociationLabelsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LabelsBetweenObjectPair>
    }
}
