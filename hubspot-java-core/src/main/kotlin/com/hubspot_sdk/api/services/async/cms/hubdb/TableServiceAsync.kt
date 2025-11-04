// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.hubdb

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.cms.hubdb.HubDbTableV3
import com.hubspot_sdk.api.models.cms.hubdb.HubDbTableV3Request
import com.hubspot_sdk.api.models.cms.hubdb.ImportResult
import com.hubspot_sdk.api.models.cms.hubdb.tables.TableCloneDraftParams
import com.hubspot_sdk.api.models.cms.hubdb.tables.TableCreateParams
import com.hubspot_sdk.api.models.cms.hubdb.tables.TableDeleteParams
import com.hubspot_sdk.api.models.cms.hubdb.tables.TableDeleteVersionParams
import com.hubspot_sdk.api.models.cms.hubdb.tables.TableExportDraftParams
import com.hubspot_sdk.api.models.cms.hubdb.tables.TableExportParams
import com.hubspot_sdk.api.models.cms.hubdb.tables.TableGetDraftParams
import com.hubspot_sdk.api.models.cms.hubdb.tables.TableGetParams
import com.hubspot_sdk.api.models.cms.hubdb.tables.TableImportDraftParams
import com.hubspot_sdk.api.models.cms.hubdb.tables.TableListDraftPageAsync
import com.hubspot_sdk.api.models.cms.hubdb.tables.TableListDraftParams
import com.hubspot_sdk.api.models.cms.hubdb.tables.TableListPageAsync
import com.hubspot_sdk.api.models.cms.hubdb.tables.TableListParams
import com.hubspot_sdk.api.models.cms.hubdb.tables.TablePublishDraftParams
import com.hubspot_sdk.api.models.cms.hubdb.tables.TableResetDraftParams
import com.hubspot_sdk.api.models.cms.hubdb.tables.TableUnpublishParams
import com.hubspot_sdk.api.models.cms.hubdb.tables.TableUpdateDraftParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TableServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TableServiceAsync

    /**
     * Creates a new draft HubDB table given a JSON schema. The table name and label should be
     * unique for each account.
     */
    fun create(params: TableCreateParams): CompletableFuture<HubDbTableV3> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TableCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HubDbTableV3>

    /** @see create */
    fun create(
        hubDbTableV3Request: HubDbTableV3Request,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HubDbTableV3> =
        create(
            TableCreateParams.builder().hubDbTableV3Request(hubDbTableV3Request).build(),
            requestOptions,
        )

    /** @see create */
    fun create(hubDbTableV3Request: HubDbTableV3Request): CompletableFuture<HubDbTableV3> =
        create(hubDbTableV3Request, RequestOptions.none())

    /**
     * Returns the details for the published version of each table defined in an account, including
     * column definitions.
     */
    fun list(): CompletableFuture<TableListPageAsync> = list(TableListParams.none())

    /** @see list */
    fun list(
        params: TableListParams = TableListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TableListPageAsync>

    /** @see list */
    fun list(
        params: TableListParams = TableListParams.none()
    ): CompletableFuture<TableListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<TableListPageAsync> =
        list(TableListParams.none(), requestOptions)

    /**
     * Archive (soft delete) an existing HubDB table. This archives both the published and draft
     * versions.
     */
    fun delete(tableIdOrName: String): CompletableFuture<Void?> =
        delete(tableIdOrName, TableDeleteParams.none())

    /** @see delete */
    fun delete(
        tableIdOrName: String,
        params: TableDeleteParams = TableDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

    /** @see delete */
    fun delete(
        tableIdOrName: String,
        params: TableDeleteParams = TableDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(tableIdOrName, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TableDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: TableDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(tableIdOrName: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(tableIdOrName, TableDeleteParams.none(), requestOptions)

    /**
     * Clone an existing HubDB table. The `newName` and `newLabel` of the new table can be sent as
     * JSON in the request body. This will create the cloned table as a draft.
     */
    fun cloneDraft(
        tableIdOrName: String,
        params: TableCloneDraftParams,
    ): CompletableFuture<HubDbTableV3> = cloneDraft(tableIdOrName, params, RequestOptions.none())

    /** @see cloneDraft */
    fun cloneDraft(
        tableIdOrName: String,
        params: TableCloneDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HubDbTableV3> =
        cloneDraft(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

    /** @see cloneDraft */
    fun cloneDraft(params: TableCloneDraftParams): CompletableFuture<HubDbTableV3> =
        cloneDraft(params, RequestOptions.none())

    /** @see cloneDraft */
    fun cloneDraft(
        params: TableCloneDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HubDbTableV3>

    /** Delete a specific version of a table */
    fun deleteVersion(versionId: Long, params: TableDeleteVersionParams): CompletableFuture<Void?> =
        deleteVersion(versionId, params, RequestOptions.none())

    /** @see deleteVersion */
    fun deleteVersion(
        versionId: Long,
        params: TableDeleteVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteVersion(params.toBuilder().versionId(versionId).build(), requestOptions)

    /** @see deleteVersion */
    fun deleteVersion(params: TableDeleteVersionParams): CompletableFuture<Void?> =
        deleteVersion(params, RequestOptions.none())

    /** @see deleteVersion */
    fun deleteVersion(
        params: TableDeleteVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Exports the published version of a table in a specified format. */
    fun export(tableIdOrName: String): CompletableFuture<HttpResponse> =
        export(tableIdOrName, TableExportParams.none())

    /** @see export */
    fun export(
        tableIdOrName: String,
        params: TableExportParams = TableExportParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        export(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

    /** @see export */
    fun export(
        tableIdOrName: String,
        params: TableExportParams = TableExportParams.none(),
    ): CompletableFuture<HttpResponse> = export(tableIdOrName, params, RequestOptions.none())

    /** @see export */
    fun export(
        params: TableExportParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see export */
    fun export(params: TableExportParams): CompletableFuture<HttpResponse> =
        export(params, RequestOptions.none())

    /** @see export */
    fun export(
        tableIdOrName: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        export(tableIdOrName, TableExportParams.none(), requestOptions)

    /** Exports the draft version of a table to CSV / EXCEL format. */
    fun exportDraft(tableIdOrName: String): CompletableFuture<HttpResponse> =
        exportDraft(tableIdOrName, TableExportDraftParams.none())

    /** @see exportDraft */
    fun exportDraft(
        tableIdOrName: String,
        params: TableExportDraftParams = TableExportDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        exportDraft(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

    /** @see exportDraft */
    fun exportDraft(
        tableIdOrName: String,
        params: TableExportDraftParams = TableExportDraftParams.none(),
    ): CompletableFuture<HttpResponse> = exportDraft(tableIdOrName, params, RequestOptions.none())

    /** @see exportDraft */
    fun exportDraft(
        params: TableExportDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see exportDraft */
    fun exportDraft(params: TableExportDraftParams): CompletableFuture<HttpResponse> =
        exportDraft(params, RequestOptions.none())

    /** @see exportDraft */
    fun exportDraft(
        tableIdOrName: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        exportDraft(tableIdOrName, TableExportDraftParams.none(), requestOptions)

    /**
     * Returns the details for the published version of the specified table. This will include the
     * definitions for the columns in the table and the number of rows in the table.
     *
     * **Note:** This endpoint can be accessed without any authentication if the table is set to be
     * allowed for public access. To do so, you'll need to include the HubSpot account ID in a
     * `portalId` query parameter.
     */
    fun get(tableIdOrName: String): CompletableFuture<HubDbTableV3> =
        get(tableIdOrName, TableGetParams.none())

    /** @see get */
    fun get(
        tableIdOrName: String,
        params: TableGetParams = TableGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HubDbTableV3> =
        get(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

    /** @see get */
    fun get(
        tableIdOrName: String,
        params: TableGetParams = TableGetParams.none(),
    ): CompletableFuture<HubDbTableV3> = get(tableIdOrName, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: TableGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HubDbTableV3>

    /** @see get */
    fun get(params: TableGetParams): CompletableFuture<HubDbTableV3> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        tableIdOrName: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<HubDbTableV3> = get(tableIdOrName, TableGetParams.none(), requestOptions)

    /**
     * Get the details for the draft version of a specific HubDB table. This will include the
     * definitions for the columns in the table and the number of rows in the table.
     */
    fun getDraft(tableIdOrName: String): CompletableFuture<HubDbTableV3> =
        getDraft(tableIdOrName, TableGetDraftParams.none())

    /** @see getDraft */
    fun getDraft(
        tableIdOrName: String,
        params: TableGetDraftParams = TableGetDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HubDbTableV3> =
        getDraft(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

    /** @see getDraft */
    fun getDraft(
        tableIdOrName: String,
        params: TableGetDraftParams = TableGetDraftParams.none(),
    ): CompletableFuture<HubDbTableV3> = getDraft(tableIdOrName, params, RequestOptions.none())

    /** @see getDraft */
    fun getDraft(
        params: TableGetDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HubDbTableV3>

    /** @see getDraft */
    fun getDraft(params: TableGetDraftParams): CompletableFuture<HubDbTableV3> =
        getDraft(params, RequestOptions.none())

    /** @see getDraft */
    fun getDraft(
        tableIdOrName: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<HubDbTableV3> =
        getDraft(tableIdOrName, TableGetDraftParams.none(), requestOptions)

    /**
     * Import the contents of a CSV file into an existing HubDB table. The data will always be
     * imported into the draft version of the table. Use the `/publish` endpoint to push these
     * changes to the published version. This endpoint takes a multi-part POST request. The first
     * part will be a set of JSON-formatted options for the import and you can specify this with the
     * name as `config`. The second part will be the CSV file you want to import and you can specify
     * this with the name as `file`. Refer the
     * [overview section](https://developers.hubspot.com/docs/api/cms/hubdb#importing-tables) to
     * check the details and format of the JSON-formatted options for the import.
     */
    fun importDraft(tableIdOrName: String): CompletableFuture<ImportResult> =
        importDraft(tableIdOrName, TableImportDraftParams.none())

    /** @see importDraft */
    fun importDraft(
        tableIdOrName: String,
        params: TableImportDraftParams = TableImportDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ImportResult> =
        importDraft(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

    /** @see importDraft */
    fun importDraft(
        tableIdOrName: String,
        params: TableImportDraftParams = TableImportDraftParams.none(),
    ): CompletableFuture<ImportResult> = importDraft(tableIdOrName, params, RequestOptions.none())

    /** @see importDraft */
    fun importDraft(
        params: TableImportDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ImportResult>

    /** @see importDraft */
    fun importDraft(params: TableImportDraftParams): CompletableFuture<ImportResult> =
        importDraft(params, RequestOptions.none())

    /** @see importDraft */
    fun importDraft(
        tableIdOrName: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ImportResult> =
        importDraft(tableIdOrName, TableImportDraftParams.none(), requestOptions)

    /**
     * Returns the details for each draft table defined in the specified account, including column
     * definitions.
     */
    fun listDraft(): CompletableFuture<TableListDraftPageAsync> =
        listDraft(TableListDraftParams.none())

    /** @see listDraft */
    fun listDraft(
        params: TableListDraftParams = TableListDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TableListDraftPageAsync>

    /** @see listDraft */
    fun listDraft(
        params: TableListDraftParams = TableListDraftParams.none()
    ): CompletableFuture<TableListDraftPageAsync> = listDraft(params, RequestOptions.none())

    /** @see listDraft */
    fun listDraft(requestOptions: RequestOptions): CompletableFuture<TableListDraftPageAsync> =
        listDraft(TableListDraftParams.none(), requestOptions)

    /**
     * Publishes the table by copying the data and table schema changes from draft version to the
     * published version, meaning any website pages using data from the table will be updated.
     */
    fun publishDraft(tableIdOrName: String): CompletableFuture<HubDbTableV3> =
        publishDraft(tableIdOrName, TablePublishDraftParams.none())

    /** @see publishDraft */
    fun publishDraft(
        tableIdOrName: String,
        params: TablePublishDraftParams = TablePublishDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HubDbTableV3> =
        publishDraft(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

    /** @see publishDraft */
    fun publishDraft(
        tableIdOrName: String,
        params: TablePublishDraftParams = TablePublishDraftParams.none(),
    ): CompletableFuture<HubDbTableV3> = publishDraft(tableIdOrName, params, RequestOptions.none())

    /** @see publishDraft */
    fun publishDraft(
        params: TablePublishDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HubDbTableV3>

    /** @see publishDraft */
    fun publishDraft(params: TablePublishDraftParams): CompletableFuture<HubDbTableV3> =
        publishDraft(params, RequestOptions.none())

    /** @see publishDraft */
    fun publishDraft(
        tableIdOrName: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<HubDbTableV3> =
        publishDraft(tableIdOrName, TablePublishDraftParams.none(), requestOptions)

    /**
     * Replaces the data in the draft version of the table with values from the published version.
     * Any unpublished changes in the draft will be lost after this call is made.
     */
    fun resetDraft(tableIdOrName: String): CompletableFuture<HubDbTableV3> =
        resetDraft(tableIdOrName, TableResetDraftParams.none())

    /** @see resetDraft */
    fun resetDraft(
        tableIdOrName: String,
        params: TableResetDraftParams = TableResetDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HubDbTableV3> =
        resetDraft(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

    /** @see resetDraft */
    fun resetDraft(
        tableIdOrName: String,
        params: TableResetDraftParams = TableResetDraftParams.none(),
    ): CompletableFuture<HubDbTableV3> = resetDraft(tableIdOrName, params, RequestOptions.none())

    /** @see resetDraft */
    fun resetDraft(
        params: TableResetDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HubDbTableV3>

    /** @see resetDraft */
    fun resetDraft(params: TableResetDraftParams): CompletableFuture<HubDbTableV3> =
        resetDraft(params, RequestOptions.none())

    /** @see resetDraft */
    fun resetDraft(
        tableIdOrName: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<HubDbTableV3> =
        resetDraft(tableIdOrName, TableResetDraftParams.none(), requestOptions)

    /**
     * Unpublishes the table, meaning any website pages using data from the table will not render
     * any data.
     */
    fun unpublish(tableIdOrName: String): CompletableFuture<HubDbTableV3> =
        unpublish(tableIdOrName, TableUnpublishParams.none())

    /** @see unpublish */
    fun unpublish(
        tableIdOrName: String,
        params: TableUnpublishParams = TableUnpublishParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HubDbTableV3> =
        unpublish(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

    /** @see unpublish */
    fun unpublish(
        tableIdOrName: String,
        params: TableUnpublishParams = TableUnpublishParams.none(),
    ): CompletableFuture<HubDbTableV3> = unpublish(tableIdOrName, params, RequestOptions.none())

    /** @see unpublish */
    fun unpublish(
        params: TableUnpublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HubDbTableV3>

    /** @see unpublish */
    fun unpublish(params: TableUnpublishParams): CompletableFuture<HubDbTableV3> =
        unpublish(params, RequestOptions.none())

    /** @see unpublish */
    fun unpublish(
        tableIdOrName: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<HubDbTableV3> =
        unpublish(tableIdOrName, TableUnpublishParams.none(), requestOptions)

    /**
     * Update an existing HubDB table. You can use this endpoint to add or remove columns to the
     * table as well as restore an archived table. Tables updated using the endpoint will only
     * modify the draft verion of the table. Use the `/publish` endpoint to push all the changes to
     * the published version. To restore a table, include the query parameter `archived=true` and
     * `"archived": false` in the json body. **Note:** You need to include all the columns in the
     * input when you are adding/removing/updating a column. If you do not include an already
     * existing column in the request, it will be deleted.
     */
    fun updateDraft(
        tableIdOrName: String,
        params: TableUpdateDraftParams,
    ): CompletableFuture<HubDbTableV3> = updateDraft(tableIdOrName, params, RequestOptions.none())

    /** @see updateDraft */
    fun updateDraft(
        tableIdOrName: String,
        params: TableUpdateDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HubDbTableV3> =
        updateDraft(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

    /** @see updateDraft */
    fun updateDraft(params: TableUpdateDraftParams): CompletableFuture<HubDbTableV3> =
        updateDraft(params, RequestOptions.none())

    /** @see updateDraft */
    fun updateDraft(
        params: TableUpdateDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HubDbTableV3>

    /** A view of [TableServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TableServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /cms/v3/hubdb/tables`, but is otherwise the same as
         * [TableServiceAsync.create].
         */
        fun create(params: TableCreateParams): CompletableFuture<HttpResponseFor<HubDbTableV3>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: TableCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HubDbTableV3>>

        /** @see create */
        fun create(
            hubDbTableV3Request: HubDbTableV3Request,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HubDbTableV3>> =
            create(
                TableCreateParams.builder().hubDbTableV3Request(hubDbTableV3Request).build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            hubDbTableV3Request: HubDbTableV3Request
        ): CompletableFuture<HttpResponseFor<HubDbTableV3>> =
            create(hubDbTableV3Request, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /cms/v3/hubdb/tables`, but is otherwise the same as
         * [TableServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<TableListPageAsync>> =
            list(TableListParams.none())

        /** @see list */
        fun list(
            params: TableListParams = TableListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TableListPageAsync>>

        /** @see list */
        fun list(
            params: TableListParams = TableListParams.none()
        ): CompletableFuture<HttpResponseFor<TableListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TableListPageAsync>> =
            list(TableListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /cms/v3/hubdb/tables/{tableIdOrName}`, but is
         * otherwise the same as [TableServiceAsync.delete].
         */
        fun delete(tableIdOrName: String): CompletableFuture<HttpResponse> =
            delete(tableIdOrName, TableDeleteParams.none())

        /** @see delete */
        fun delete(
            tableIdOrName: String,
            params: TableDeleteParams = TableDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

        /** @see delete */
        fun delete(
            tableIdOrName: String,
            params: TableDeleteParams = TableDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(tableIdOrName, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: TableDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: TableDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            tableIdOrName: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(tableIdOrName, TableDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /cms/v3/hubdb/tables/{tableIdOrName}/draft/clone`,
         * but is otherwise the same as [TableServiceAsync.cloneDraft].
         */
        fun cloneDraft(
            tableIdOrName: String,
            params: TableCloneDraftParams,
        ): CompletableFuture<HttpResponseFor<HubDbTableV3>> =
            cloneDraft(tableIdOrName, params, RequestOptions.none())

        /** @see cloneDraft */
        fun cloneDraft(
            tableIdOrName: String,
            params: TableCloneDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HubDbTableV3>> =
            cloneDraft(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

        /** @see cloneDraft */
        fun cloneDraft(
            params: TableCloneDraftParams
        ): CompletableFuture<HttpResponseFor<HubDbTableV3>> =
            cloneDraft(params, RequestOptions.none())

        /** @see cloneDraft */
        fun cloneDraft(
            params: TableCloneDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HubDbTableV3>>

        /**
         * Returns a raw HTTP response for `delete
         * /cms/v3/hubdb/tables/{tableIdOrName}/versions/{versionId}`, but is otherwise the same as
         * [TableServiceAsync.deleteVersion].
         */
        fun deleteVersion(
            versionId: Long,
            params: TableDeleteVersionParams,
        ): CompletableFuture<HttpResponse> = deleteVersion(versionId, params, RequestOptions.none())

        /** @see deleteVersion */
        fun deleteVersion(
            versionId: Long,
            params: TableDeleteVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteVersion(params.toBuilder().versionId(versionId).build(), requestOptions)

        /** @see deleteVersion */
        fun deleteVersion(params: TableDeleteVersionParams): CompletableFuture<HttpResponse> =
            deleteVersion(params, RequestOptions.none())

        /** @see deleteVersion */
        fun deleteVersion(
            params: TableDeleteVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /cms/v3/hubdb/tables/{tableIdOrName}/export`, but is
         * otherwise the same as [TableServiceAsync.export].
         */
        fun export(tableIdOrName: String): CompletableFuture<HttpResponse> =
            export(tableIdOrName, TableExportParams.none())

        /** @see export */
        fun export(
            tableIdOrName: String,
            params: TableExportParams = TableExportParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            export(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

        /** @see export */
        fun export(
            tableIdOrName: String,
            params: TableExportParams = TableExportParams.none(),
        ): CompletableFuture<HttpResponse> = export(tableIdOrName, params, RequestOptions.none())

        /** @see export */
        fun export(
            params: TableExportParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see export */
        fun export(params: TableExportParams): CompletableFuture<HttpResponse> =
            export(params, RequestOptions.none())

        /** @see export */
        fun export(
            tableIdOrName: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            export(tableIdOrName, TableExportParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/v3/hubdb/tables/{tableIdOrName}/draft/export`,
         * but is otherwise the same as [TableServiceAsync.exportDraft].
         */
        fun exportDraft(tableIdOrName: String): CompletableFuture<HttpResponse> =
            exportDraft(tableIdOrName, TableExportDraftParams.none())

        /** @see exportDraft */
        fun exportDraft(
            tableIdOrName: String,
            params: TableExportDraftParams = TableExportDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            exportDraft(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

        /** @see exportDraft */
        fun exportDraft(
            tableIdOrName: String,
            params: TableExportDraftParams = TableExportDraftParams.none(),
        ): CompletableFuture<HttpResponse> =
            exportDraft(tableIdOrName, params, RequestOptions.none())

        /** @see exportDraft */
        fun exportDraft(
            params: TableExportDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see exportDraft */
        fun exportDraft(params: TableExportDraftParams): CompletableFuture<HttpResponse> =
            exportDraft(params, RequestOptions.none())

        /** @see exportDraft */
        fun exportDraft(
            tableIdOrName: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            exportDraft(tableIdOrName, TableExportDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/v3/hubdb/tables/{tableIdOrName}`, but is
         * otherwise the same as [TableServiceAsync.get].
         */
        fun get(tableIdOrName: String): CompletableFuture<HttpResponseFor<HubDbTableV3>> =
            get(tableIdOrName, TableGetParams.none())

        /** @see get */
        fun get(
            tableIdOrName: String,
            params: TableGetParams = TableGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HubDbTableV3>> =
            get(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

        /** @see get */
        fun get(
            tableIdOrName: String,
            params: TableGetParams = TableGetParams.none(),
        ): CompletableFuture<HttpResponseFor<HubDbTableV3>> =
            get(tableIdOrName, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: TableGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HubDbTableV3>>

        /** @see get */
        fun get(params: TableGetParams): CompletableFuture<HttpResponseFor<HubDbTableV3>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            tableIdOrName: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<HubDbTableV3>> =
            get(tableIdOrName, TableGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/v3/hubdb/tables/{tableIdOrName}/draft`, but is
         * otherwise the same as [TableServiceAsync.getDraft].
         */
        fun getDraft(tableIdOrName: String): CompletableFuture<HttpResponseFor<HubDbTableV3>> =
            getDraft(tableIdOrName, TableGetDraftParams.none())

        /** @see getDraft */
        fun getDraft(
            tableIdOrName: String,
            params: TableGetDraftParams = TableGetDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HubDbTableV3>> =
            getDraft(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

        /** @see getDraft */
        fun getDraft(
            tableIdOrName: String,
            params: TableGetDraftParams = TableGetDraftParams.none(),
        ): CompletableFuture<HttpResponseFor<HubDbTableV3>> =
            getDraft(tableIdOrName, params, RequestOptions.none())

        /** @see getDraft */
        fun getDraft(
            params: TableGetDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HubDbTableV3>>

        /** @see getDraft */
        fun getDraft(
            params: TableGetDraftParams
        ): CompletableFuture<HttpResponseFor<HubDbTableV3>> =
            getDraft(params, RequestOptions.none())

        /** @see getDraft */
        fun getDraft(
            tableIdOrName: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<HubDbTableV3>> =
            getDraft(tableIdOrName, TableGetDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /cms/v3/hubdb/tables/{tableIdOrName}/draft/import`,
         * but is otherwise the same as [TableServiceAsync.importDraft].
         */
        fun importDraft(tableIdOrName: String): CompletableFuture<HttpResponseFor<ImportResult>> =
            importDraft(tableIdOrName, TableImportDraftParams.none())

        /** @see importDraft */
        fun importDraft(
            tableIdOrName: String,
            params: TableImportDraftParams = TableImportDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ImportResult>> =
            importDraft(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

        /** @see importDraft */
        fun importDraft(
            tableIdOrName: String,
            params: TableImportDraftParams = TableImportDraftParams.none(),
        ): CompletableFuture<HttpResponseFor<ImportResult>> =
            importDraft(tableIdOrName, params, RequestOptions.none())

        /** @see importDraft */
        fun importDraft(
            params: TableImportDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ImportResult>>

        /** @see importDraft */
        fun importDraft(
            params: TableImportDraftParams
        ): CompletableFuture<HttpResponseFor<ImportResult>> =
            importDraft(params, RequestOptions.none())

        /** @see importDraft */
        fun importDraft(
            tableIdOrName: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ImportResult>> =
            importDraft(tableIdOrName, TableImportDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/v3/hubdb/tables/draft`, but is otherwise the
         * same as [TableServiceAsync.listDraft].
         */
        fun listDraft(): CompletableFuture<HttpResponseFor<TableListDraftPageAsync>> =
            listDraft(TableListDraftParams.none())

        /** @see listDraft */
        fun listDraft(
            params: TableListDraftParams = TableListDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TableListDraftPageAsync>>

        /** @see listDraft */
        fun listDraft(
            params: TableListDraftParams = TableListDraftParams.none()
        ): CompletableFuture<HttpResponseFor<TableListDraftPageAsync>> =
            listDraft(params, RequestOptions.none())

        /** @see listDraft */
        fun listDraft(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TableListDraftPageAsync>> =
            listDraft(TableListDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/hubdb/tables/{tableIdOrName}/draft/publish`, but is otherwise the same as
         * [TableServiceAsync.publishDraft].
         */
        fun publishDraft(tableIdOrName: String): CompletableFuture<HttpResponseFor<HubDbTableV3>> =
            publishDraft(tableIdOrName, TablePublishDraftParams.none())

        /** @see publishDraft */
        fun publishDraft(
            tableIdOrName: String,
            params: TablePublishDraftParams = TablePublishDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HubDbTableV3>> =
            publishDraft(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

        /** @see publishDraft */
        fun publishDraft(
            tableIdOrName: String,
            params: TablePublishDraftParams = TablePublishDraftParams.none(),
        ): CompletableFuture<HttpResponseFor<HubDbTableV3>> =
            publishDraft(tableIdOrName, params, RequestOptions.none())

        /** @see publishDraft */
        fun publishDraft(
            params: TablePublishDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HubDbTableV3>>

        /** @see publishDraft */
        fun publishDraft(
            params: TablePublishDraftParams
        ): CompletableFuture<HttpResponseFor<HubDbTableV3>> =
            publishDraft(params, RequestOptions.none())

        /** @see publishDraft */
        fun publishDraft(
            tableIdOrName: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<HubDbTableV3>> =
            publishDraft(tableIdOrName, TablePublishDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /cms/v3/hubdb/tables/{tableIdOrName}/draft/reset`,
         * but is otherwise the same as [TableServiceAsync.resetDraft].
         */
        fun resetDraft(tableIdOrName: String): CompletableFuture<HttpResponseFor<HubDbTableV3>> =
            resetDraft(tableIdOrName, TableResetDraftParams.none())

        /** @see resetDraft */
        fun resetDraft(
            tableIdOrName: String,
            params: TableResetDraftParams = TableResetDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HubDbTableV3>> =
            resetDraft(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

        /** @see resetDraft */
        fun resetDraft(
            tableIdOrName: String,
            params: TableResetDraftParams = TableResetDraftParams.none(),
        ): CompletableFuture<HttpResponseFor<HubDbTableV3>> =
            resetDraft(tableIdOrName, params, RequestOptions.none())

        /** @see resetDraft */
        fun resetDraft(
            params: TableResetDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HubDbTableV3>>

        /** @see resetDraft */
        fun resetDraft(
            params: TableResetDraftParams
        ): CompletableFuture<HttpResponseFor<HubDbTableV3>> =
            resetDraft(params, RequestOptions.none())

        /** @see resetDraft */
        fun resetDraft(
            tableIdOrName: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<HubDbTableV3>> =
            resetDraft(tableIdOrName, TableResetDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /cms/v3/hubdb/tables/{tableIdOrName}/unpublish`,
         * but is otherwise the same as [TableServiceAsync.unpublish].
         */
        fun unpublish(tableIdOrName: String): CompletableFuture<HttpResponseFor<HubDbTableV3>> =
            unpublish(tableIdOrName, TableUnpublishParams.none())

        /** @see unpublish */
        fun unpublish(
            tableIdOrName: String,
            params: TableUnpublishParams = TableUnpublishParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HubDbTableV3>> =
            unpublish(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

        /** @see unpublish */
        fun unpublish(
            tableIdOrName: String,
            params: TableUnpublishParams = TableUnpublishParams.none(),
        ): CompletableFuture<HttpResponseFor<HubDbTableV3>> =
            unpublish(tableIdOrName, params, RequestOptions.none())

        /** @see unpublish */
        fun unpublish(
            params: TableUnpublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HubDbTableV3>>

        /** @see unpublish */
        fun unpublish(
            params: TableUnpublishParams
        ): CompletableFuture<HttpResponseFor<HubDbTableV3>> =
            unpublish(params, RequestOptions.none())

        /** @see unpublish */
        fun unpublish(
            tableIdOrName: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<HubDbTableV3>> =
            unpublish(tableIdOrName, TableUnpublishParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /cms/v3/hubdb/tables/{tableIdOrName}/draft`, but
         * is otherwise the same as [TableServiceAsync.updateDraft].
         */
        fun updateDraft(
            tableIdOrName: String,
            params: TableUpdateDraftParams,
        ): CompletableFuture<HttpResponseFor<HubDbTableV3>> =
            updateDraft(tableIdOrName, params, RequestOptions.none())

        /** @see updateDraft */
        fun updateDraft(
            tableIdOrName: String,
            params: TableUpdateDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HubDbTableV3>> =
            updateDraft(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

        /** @see updateDraft */
        fun updateDraft(
            params: TableUpdateDraftParams
        ): CompletableFuture<HttpResponseFor<HubDbTableV3>> =
            updateDraft(params, RequestOptions.none())

        /** @see updateDraft */
        fun updateDraft(
            params: TableUpdateDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HubDbTableV3>>
    }
}
