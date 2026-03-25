// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.objects

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.SimplePublicObject
import com.hubspot_sdk.api.models.crm.objects.CollectionResponseWithTotalSimplePublicObject
import com.hubspot_sdk.api.models.crm.objects.PublicObjectSearchRequest
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectInputForCreate
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectWithAssociations
import com.hubspot_sdk.api.models.crm.objects.communications.CommunicationCreateParams
import com.hubspot_sdk.api.models.crm.objects.communications.CommunicationDeleteParams
import com.hubspot_sdk.api.models.crm.objects.communications.CommunicationGetParams
import com.hubspot_sdk.api.models.crm.objects.communications.CommunicationListPage
import com.hubspot_sdk.api.models.crm.objects.communications.CommunicationListParams
import com.hubspot_sdk.api.models.crm.objects.communications.CommunicationSearchParams
import com.hubspot_sdk.api.models.crm.objects.communications.CommunicationUpdateParams
import com.hubspot_sdk.api.services.blocking.crm.objects.communications.BatchService
import java.util.function.Consumer

interface CommunicationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CommunicationService

    fun batch(): BatchService

    /**
     * Create a single communication (WhatsApp, SMS, LinkedIn message). Include a `properties`
     * object to define
     * [property values](https://developers.hubspot.com/docs/guides/api/crm/properties) for the
     * {objectName}, along with an `associations` array to define
     * [associations](https://developers.hubspot.com/docs/guides/api/crm/associations/associations-v4)
     * with other CRM records.
     */
    fun create(params: CommunicationCreateParams): SimplePublicObject =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CommunicationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject =
        create(
            CommunicationCreateParams.builder()
                .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
    ): SimplePublicObject = create(simplePublicObjectInputForCreate, RequestOptions.none())

    /**
     * Update a communication by ID (`objectId`) or unique property value (`idProperty`). Provided
     * property values will be overwritten. Read-only and non-existent properties will result in an
     * error. Properties values can be cleared by passing an empty string.
     */
    fun update(communicationId: String, params: CommunicationUpdateParams): SimplePublicObject =
        update(communicationId, params, RequestOptions.none())

    /** @see update */
    fun update(
        communicationId: String,
        params: CommunicationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject =
        update(params.toBuilder().communicationId(communicationId).build(), requestOptions)

    /** @see update */
    fun update(params: CommunicationUpdateParams): SimplePublicObject =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CommunicationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /**
     * Retrieve a communication by its ID (`objectId`) or by a unique property (`idProperty`). You
     * can specify what is returned using the `properties` query parameter.
     */
    fun list(): CommunicationListPage = list(CommunicationListParams.none())

    /** @see list */
    fun list(
        params: CommunicationListParams = CommunicationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommunicationListPage

    /** @see list */
    fun list(
        params: CommunicationListParams = CommunicationListParams.none()
    ): CommunicationListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CommunicationListPage =
        list(CommunicationListParams.none(), requestOptions)

    /** Delete a communication by ID. */
    fun delete(communicationId: String) = delete(communicationId, CommunicationDeleteParams.none())

    /** @see delete */
    fun delete(
        communicationId: String,
        params: CommunicationDeleteParams = CommunicationDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().communicationId(communicationId).build(), requestOptions)

    /** @see delete */
    fun delete(
        communicationId: String,
        params: CommunicationDeleteParams = CommunicationDeleteParams.none(),
    ) = delete(communicationId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: CommunicationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: CommunicationDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(communicationId: String, requestOptions: RequestOptions) =
        delete(communicationId, CommunicationDeleteParams.none(), requestOptions)

    /**
     * Retrieve a communication (WhatsApp, SMS, LinkedIn message) by its ID (`objectId`) or by a
     * unique property (`idProperty`). You can specify what is returned using the `properties` query
     * parameter.
     */
    fun get(communicationId: String): SimplePublicObjectWithAssociations =
        get(communicationId, CommunicationGetParams.none())

    /** @see get */
    fun get(
        communicationId: String,
        params: CommunicationGetParams = CommunicationGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations =
        get(params.toBuilder().communicationId(communicationId).build(), requestOptions)

    /** @see get */
    fun get(
        communicationId: String,
        params: CommunicationGetParams = CommunicationGetParams.none(),
    ): SimplePublicObjectWithAssociations = get(communicationId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: CommunicationGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations

    /** @see get */
    fun get(params: CommunicationGetParams): SimplePublicObjectWithAssociations =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        communicationId: String,
        requestOptions: RequestOptions,
    ): SimplePublicObjectWithAssociations =
        get(communicationId, CommunicationGetParams.none(), requestOptions)

    /**
     * Search for messages by filtering on properties, searching through associations, and sorting
     * results. Learn more about
     * [CRM search](https://developers.hubspot.com/docs/guides/api/crm/search#make-a-search-request).
     */
    fun search(params: CommunicationSearchParams): CollectionResponseWithTotalSimplePublicObject =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: CommunicationSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject =
        search(
            CommunicationSearchParams.builder()
                .publicObjectSearchRequest(publicObjectSearchRequest)
                .build(),
            requestOptions,
        )

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest
    ): CollectionResponseWithTotalSimplePublicObject =
        search(publicObjectSearchRequest, RequestOptions.none())

    /**
     * A view of [CommunicationService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CommunicationService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/communications`, but is
         * otherwise the same as [CommunicationService.create].
         */
        @MustBeClosed
        fun create(params: CommunicationCreateParams): HttpResponseFor<SimplePublicObject> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CommunicationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /** @see create */
        @MustBeClosed
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            create(
                CommunicationCreateParams.builder()
                    .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                    .build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
        ): HttpResponseFor<SimplePublicObject> =
            create(simplePublicObjectInputForCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch
         * /crm/objects/2026-03/communications/{communicationId}`, but is otherwise the same as
         * [CommunicationService.update].
         */
        @MustBeClosed
        fun update(
            communicationId: String,
            params: CommunicationUpdateParams,
        ): HttpResponseFor<SimplePublicObject> =
            update(communicationId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            communicationId: String,
            params: CommunicationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            update(params.toBuilder().communicationId(communicationId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: CommunicationUpdateParams): HttpResponseFor<SimplePublicObject> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: CommunicationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/communications`, but is
         * otherwise the same as [CommunicationService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<CommunicationListPage> = list(CommunicationListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CommunicationListParams = CommunicationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommunicationListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: CommunicationListParams = CommunicationListParams.none()
        ): HttpResponseFor<CommunicationListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CommunicationListPage> =
            list(CommunicationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /crm/objects/2026-03/communications/{communicationId}`, but is otherwise the same as
         * [CommunicationService.delete].
         */
        @MustBeClosed
        fun delete(communicationId: String): HttpResponse =
            delete(communicationId, CommunicationDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            communicationId: String,
            params: CommunicationDeleteParams = CommunicationDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().communicationId(communicationId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            communicationId: String,
            params: CommunicationDeleteParams = CommunicationDeleteParams.none(),
        ): HttpResponse = delete(communicationId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: CommunicationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: CommunicationDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(communicationId: String, requestOptions: RequestOptions): HttpResponse =
            delete(communicationId, CommunicationDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /crm/objects/2026-03/communications/{communicationId}`, but is otherwise the same as
         * [CommunicationService.get].
         */
        @MustBeClosed
        fun get(communicationId: String): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(communicationId, CommunicationGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            communicationId: String,
            params: CommunicationGetParams = CommunicationGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params.toBuilder().communicationId(communicationId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            communicationId: String,
            params: CommunicationGetParams = CommunicationGetParams.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(communicationId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: CommunicationGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations>

        /** @see get */
        @MustBeClosed
        fun get(
            params: CommunicationGetParams
        ): HttpResponseFor<SimplePublicObjectWithAssociations> = get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            communicationId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(communicationId, CommunicationGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/communications/search`, but is
         * otherwise the same as [CommunicationService.search].
         */
        @MustBeClosed
        fun search(
            params: CommunicationSearchParams
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: CommunicationSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>

        /** @see search */
        @MustBeClosed
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(
                CommunicationSearchParams.builder()
                    .publicObjectSearchRequest(publicObjectSearchRequest)
                    .build(),
                requestOptions,
            )

        /** @see search */
        @MustBeClosed
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(publicObjectSearchRequest, RequestOptions.none())
    }
}
