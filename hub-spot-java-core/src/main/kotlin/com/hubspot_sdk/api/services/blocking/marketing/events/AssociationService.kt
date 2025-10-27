// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing.events

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.marketing.events.CollectionResponseWithTotalPublicListNoPaging
import com.hubspot_sdk.api.models.marketing.events.associations.AssociationAssociateByExternalAccountParams
import com.hubspot_sdk.api.models.marketing.events.associations.AssociationAssociateParams
import com.hubspot_sdk.api.models.marketing.events.associations.AssociationDeleteByExternalAccountParams
import com.hubspot_sdk.api.models.marketing.events.associations.AssociationDeleteParams
import com.hubspot_sdk.api.models.marketing.events.associations.AssociationListByExternalAccountParams
import com.hubspot_sdk.api.models.marketing.events.associations.AssociationListParams
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

    /** Gets lists associated with a marketing event by marketing event id */
    fun list(marketingEventId: String): CollectionResponseWithTotalPublicListNoPaging =
        list(marketingEventId, AssociationListParams.none())

    /** @see list */
    fun list(
        marketingEventId: String,
        params: AssociationListParams = AssociationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalPublicListNoPaging =
        list(params.toBuilder().marketingEventId(marketingEventId).build(), requestOptions)

    /** @see list */
    fun list(
        marketingEventId: String,
        params: AssociationListParams = AssociationListParams.none(),
    ): CollectionResponseWithTotalPublicListNoPaging =
        list(marketingEventId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: AssociationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalPublicListNoPaging

    /** @see list */
    fun list(params: AssociationListParams): CollectionResponseWithTotalPublicListNoPaging =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        marketingEventId: String,
        requestOptions: RequestOptions,
    ): CollectionResponseWithTotalPublicListNoPaging =
        list(marketingEventId, AssociationListParams.none(), requestOptions)

    /** Disassociates a list from a marketing event by marketing event id and ILS list id */
    fun delete(listId: String, params: AssociationDeleteParams) =
        delete(listId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        listId: String,
        params: AssociationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see delete */
    fun delete(params: AssociationDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AssociationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Associates a list with a marketing event by marketing event id and ILS list id */
    fun associate(listId: String, params: AssociationAssociateParams) =
        associate(listId, params, RequestOptions.none())

    /** @see associate */
    fun associate(
        listId: String,
        params: AssociationAssociateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = associate(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see associate */
    fun associate(params: AssociationAssociateParams) = associate(params, RequestOptions.none())

    /** @see associate */
    fun associate(
        params: AssociationAssociateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Associates a list with a marketing event by external account id, external event id, and ILS
     * list id
     */
    fun associateByExternalAccount(
        listId: String,
        params: AssociationAssociateByExternalAccountParams,
    ) = associateByExternalAccount(listId, params, RequestOptions.none())

    /** @see associateByExternalAccount */
    fun associateByExternalAccount(
        listId: String,
        params: AssociationAssociateByExternalAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = associateByExternalAccount(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see associateByExternalAccount */
    fun associateByExternalAccount(params: AssociationAssociateByExternalAccountParams) =
        associateByExternalAccount(params, RequestOptions.none())

    /** @see associateByExternalAccount */
    fun associateByExternalAccount(
        params: AssociationAssociateByExternalAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Disassociates a list from a marketing event by external account id, external event id, and
     * ILS list id
     */
    fun deleteByExternalAccount(listId: String, params: AssociationDeleteByExternalAccountParams) =
        deleteByExternalAccount(listId, params, RequestOptions.none())

    /** @see deleteByExternalAccount */
    fun deleteByExternalAccount(
        listId: String,
        params: AssociationDeleteByExternalAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteByExternalAccount(params.toBuilder().listId(listId).build(), requestOptions)

    /** @see deleteByExternalAccount */
    fun deleteByExternalAccount(params: AssociationDeleteByExternalAccountParams) =
        deleteByExternalAccount(params, RequestOptions.none())

    /** @see deleteByExternalAccount */
    fun deleteByExternalAccount(
        params: AssociationDeleteByExternalAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Gets lists associated with a marketing event by external account id and external event id */
    fun listByExternalAccount(
        externalEventId: String,
        params: AssociationListByExternalAccountParams,
    ): CollectionResponseWithTotalPublicListNoPaging =
        listByExternalAccount(externalEventId, params, RequestOptions.none())

    /** @see listByExternalAccount */
    fun listByExternalAccount(
        externalEventId: String,
        params: AssociationListByExternalAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalPublicListNoPaging =
        listByExternalAccount(
            params.toBuilder().externalEventId(externalEventId).build(),
            requestOptions,
        )

    /** @see listByExternalAccount */
    fun listByExternalAccount(
        params: AssociationListByExternalAccountParams
    ): CollectionResponseWithTotalPublicListNoPaging =
        listByExternalAccount(params, RequestOptions.none())

    /** @see listByExternalAccount */
    fun listByExternalAccount(
        params: AssociationListByExternalAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalPublicListNoPaging

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

        /**
         * Returns a raw HTTP response for `get
         * /marketing/v3/marketing-events/associations/{marketingEventId}/lists`, but is otherwise
         * the same as [AssociationService.list].
         */
        @MustBeClosed
        fun list(
            marketingEventId: String
        ): HttpResponseFor<CollectionResponseWithTotalPublicListNoPaging> =
            list(marketingEventId, AssociationListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            marketingEventId: String,
            params: AssociationListParams = AssociationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalPublicListNoPaging> =
            list(params.toBuilder().marketingEventId(marketingEventId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            marketingEventId: String,
            params: AssociationListParams = AssociationListParams.none(),
        ): HttpResponseFor<CollectionResponseWithTotalPublicListNoPaging> =
            list(marketingEventId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AssociationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalPublicListNoPaging>

        /** @see list */
        @MustBeClosed
        fun list(
            params: AssociationListParams
        ): HttpResponseFor<CollectionResponseWithTotalPublicListNoPaging> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            marketingEventId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponseWithTotalPublicListNoPaging> =
            list(marketingEventId, AssociationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /marketing/v3/marketing-events/associations/{marketingEventId}/lists/{listId}`, but is
         * otherwise the same as [AssociationService.delete].
         */
        @MustBeClosed
        fun delete(listId: String, params: AssociationDeleteParams): HttpResponse =
            delete(listId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            listId: String,
            params: AssociationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().listId(listId).build(), requestOptions)

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
         * Returns a raw HTTP response for `put
         * /marketing/v3/marketing-events/associations/{marketingEventId}/lists/{listId}`, but is
         * otherwise the same as [AssociationService.associate].
         */
        @MustBeClosed
        fun associate(listId: String, params: AssociationAssociateParams): HttpResponse =
            associate(listId, params, RequestOptions.none())

        /** @see associate */
        @MustBeClosed
        fun associate(
            listId: String,
            params: AssociationAssociateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = associate(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see associate */
        @MustBeClosed
        fun associate(params: AssociationAssociateParams): HttpResponse =
            associate(params, RequestOptions.none())

        /** @see associate */
        @MustBeClosed
        fun associate(
            params: AssociationAssociateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `put
         * /marketing/v3/marketing-events/associations/{externalAccountId}/{externalEventId}/lists/{listId}`,
         * but is otherwise the same as [AssociationService.associateByExternalAccount].
         */
        @MustBeClosed
        fun associateByExternalAccount(
            listId: String,
            params: AssociationAssociateByExternalAccountParams,
        ): HttpResponse = associateByExternalAccount(listId, params, RequestOptions.none())

        /** @see associateByExternalAccount */
        @MustBeClosed
        fun associateByExternalAccount(
            listId: String,
            params: AssociationAssociateByExternalAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            associateByExternalAccount(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see associateByExternalAccount */
        @MustBeClosed
        fun associateByExternalAccount(
            params: AssociationAssociateByExternalAccountParams
        ): HttpResponse = associateByExternalAccount(params, RequestOptions.none())

        /** @see associateByExternalAccount */
        @MustBeClosed
        fun associateByExternalAccount(
            params: AssociationAssociateByExternalAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `delete
         * /marketing/v3/marketing-events/associations/{externalAccountId}/{externalEventId}/lists/{listId}`,
         * but is otherwise the same as [AssociationService.deleteByExternalAccount].
         */
        @MustBeClosed
        fun deleteByExternalAccount(
            listId: String,
            params: AssociationDeleteByExternalAccountParams,
        ): HttpResponse = deleteByExternalAccount(listId, params, RequestOptions.none())

        /** @see deleteByExternalAccount */
        @MustBeClosed
        fun deleteByExternalAccount(
            listId: String,
            params: AssociationDeleteByExternalAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteByExternalAccount(params.toBuilder().listId(listId).build(), requestOptions)

        /** @see deleteByExternalAccount */
        @MustBeClosed
        fun deleteByExternalAccount(
            params: AssociationDeleteByExternalAccountParams
        ): HttpResponse = deleteByExternalAccount(params, RequestOptions.none())

        /** @see deleteByExternalAccount */
        @MustBeClosed
        fun deleteByExternalAccount(
            params: AssociationDeleteByExternalAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get
         * /marketing/v3/marketing-events/associations/{externalAccountId}/{externalEventId}/lists`,
         * but is otherwise the same as [AssociationService.listByExternalAccount].
         */
        @MustBeClosed
        fun listByExternalAccount(
            externalEventId: String,
            params: AssociationListByExternalAccountParams,
        ): HttpResponseFor<CollectionResponseWithTotalPublicListNoPaging> =
            listByExternalAccount(externalEventId, params, RequestOptions.none())

        /** @see listByExternalAccount */
        @MustBeClosed
        fun listByExternalAccount(
            externalEventId: String,
            params: AssociationListByExternalAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalPublicListNoPaging> =
            listByExternalAccount(
                params.toBuilder().externalEventId(externalEventId).build(),
                requestOptions,
            )

        /** @see listByExternalAccount */
        @MustBeClosed
        fun listByExternalAccount(
            params: AssociationListByExternalAccountParams
        ): HttpResponseFor<CollectionResponseWithTotalPublicListNoPaging> =
            listByExternalAccount(params, RequestOptions.none())

        /** @see listByExternalAccount */
        @MustBeClosed
        fun listByExternalAccount(
            params: AssociationListByExternalAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalPublicListNoPaging>
    }
}
