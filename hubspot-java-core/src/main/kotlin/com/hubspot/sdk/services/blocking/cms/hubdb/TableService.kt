// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.cms.hubdb

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.cms.hubdb.HubDbTableV3
import com.hubspot.sdk.models.cms.hubdb.HubDbTableV3Request
import com.hubspot.sdk.models.cms.hubdb.ImportResult
import com.hubspot.sdk.models.cms.hubdb.tables.TableCloneDraftParams
import com.hubspot.sdk.models.cms.hubdb.tables.TableCreateParams
import com.hubspot.sdk.models.cms.hubdb.tables.TableDeleteParams
import com.hubspot.sdk.models.cms.hubdb.tables.TableDeleteVersionParams
import com.hubspot.sdk.models.cms.hubdb.tables.TableExportDraftParams
import com.hubspot.sdk.models.cms.hubdb.tables.TableExportParams
import com.hubspot.sdk.models.cms.hubdb.tables.TableGetDraftParams
import com.hubspot.sdk.models.cms.hubdb.tables.TableGetParams
import com.hubspot.sdk.models.cms.hubdb.tables.TableImportDraftParams
import com.hubspot.sdk.models.cms.hubdb.tables.TableListDraftPage
import com.hubspot.sdk.models.cms.hubdb.tables.TableListDraftParams
import com.hubspot.sdk.models.cms.hubdb.tables.TableListPage
import com.hubspot.sdk.models.cms.hubdb.tables.TableListParams
import com.hubspot.sdk.models.cms.hubdb.tables.TablePublishDraftParams
import com.hubspot.sdk.models.cms.hubdb.tables.TableResetDraftParams
import com.hubspot.sdk.models.cms.hubdb.tables.TableUnpublishParams
import com.hubspot.sdk.models.cms.hubdb.tables.TableUpdateDraftParams
import java.util.function.Consumer

interface TableService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TableService

    /**
     * Creates a new draft HubDB table given a JSON schema. The table name and label should be
     * unique for each account.
     */
    fun create(params: TableCreateParams): HubDbTableV3 = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TableCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HubDbTableV3

    /** @see create */
    fun create(
        hubDbTableV3Request: HubDbTableV3Request,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HubDbTableV3 =
        create(
            TableCreateParams.builder().hubDbTableV3Request(hubDbTableV3Request).build(),
            requestOptions,
        )

    /** @see create */
    fun create(hubDbTableV3Request: HubDbTableV3Request): HubDbTableV3 =
        create(hubDbTableV3Request, RequestOptions.none())

    /**
     * Returns the details for the published version of each table defined in an account, including
     * column definitions.
     */
    fun list(): TableListPage = list(TableListParams.none())

    /** @see list */
    fun list(
        params: TableListParams = TableListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TableListPage

    /** @see list */
    fun list(params: TableListParams = TableListParams.none()): TableListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): TableListPage =
        list(TableListParams.none(), requestOptions)

    /**
     * Archive (soft delete) an existing HubDB table. This archives both the published and draft
     * versions.
     */
    fun delete(tableIdOrName: String) = delete(tableIdOrName, TableDeleteParams.none())

    /** @see delete */
    fun delete(
        tableIdOrName: String,
        params: TableDeleteParams = TableDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

    /** @see delete */
    fun delete(tableIdOrName: String, params: TableDeleteParams = TableDeleteParams.none()) =
        delete(tableIdOrName, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: TableDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: TableDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(tableIdOrName: String, requestOptions: RequestOptions) =
        delete(tableIdOrName, TableDeleteParams.none(), requestOptions)

    /**
     * Clone an existing HubDB table. The `newName` and `newLabel` of the new table can be sent as
     * JSON in the request body. This will create the cloned table as a draft.
     */
    fun cloneDraft(tableIdOrName: String, params: TableCloneDraftParams): HubDbTableV3 =
        cloneDraft(tableIdOrName, params, RequestOptions.none())

    /** @see cloneDraft */
    fun cloneDraft(
        tableIdOrName: String,
        params: TableCloneDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HubDbTableV3 =
        cloneDraft(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

    /** @see cloneDraft */
    fun cloneDraft(params: TableCloneDraftParams): HubDbTableV3 =
        cloneDraft(params, RequestOptions.none())

    /** @see cloneDraft */
    fun cloneDraft(
        params: TableCloneDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HubDbTableV3

    /** Delete a specific version of a table */
    fun deleteVersion(versionId: Long, params: TableDeleteVersionParams) =
        deleteVersion(versionId, params, RequestOptions.none())

    /** @see deleteVersion */
    fun deleteVersion(
        versionId: Long,
        params: TableDeleteVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteVersion(params.toBuilder().versionId(versionId).build(), requestOptions)

    /** @see deleteVersion */
    fun deleteVersion(params: TableDeleteVersionParams) =
        deleteVersion(params, RequestOptions.none())

    /** @see deleteVersion */
    fun deleteVersion(
        params: TableDeleteVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Exports the published version of a table in a specified format. */
    @MustBeClosed
    fun export(tableIdOrName: String): HttpResponse =
        export(tableIdOrName, TableExportParams.none())

    /** @see export */
    @MustBeClosed
    fun export(
        tableIdOrName: String,
        params: TableExportParams = TableExportParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
        export(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

    /** @see export */
    @MustBeClosed
    fun export(
        tableIdOrName: String,
        params: TableExportParams = TableExportParams.none(),
    ): HttpResponse = export(tableIdOrName, params, RequestOptions.none())

    /** @see export */
    @MustBeClosed
    fun export(
        params: TableExportParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see export */
    @MustBeClosed
    fun export(params: TableExportParams): HttpResponse = export(params, RequestOptions.none())

    /** @see export */
    @MustBeClosed
    fun export(tableIdOrName: String, requestOptions: RequestOptions): HttpResponse =
        export(tableIdOrName, TableExportParams.none(), requestOptions)

    /** Exports the draft version of a table to CSV / EXCEL format. */
    @MustBeClosed
    fun exportDraft(tableIdOrName: String): HttpResponse =
        exportDraft(tableIdOrName, TableExportDraftParams.none())

    /** @see exportDraft */
    @MustBeClosed
    fun exportDraft(
        tableIdOrName: String,
        params: TableExportDraftParams = TableExportDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
        exportDraft(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

    /** @see exportDraft */
    @MustBeClosed
    fun exportDraft(
        tableIdOrName: String,
        params: TableExportDraftParams = TableExportDraftParams.none(),
    ): HttpResponse = exportDraft(tableIdOrName, params, RequestOptions.none())

    /** @see exportDraft */
    @MustBeClosed
    fun exportDraft(
        params: TableExportDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see exportDraft */
    @MustBeClosed
    fun exportDraft(params: TableExportDraftParams): HttpResponse =
        exportDraft(params, RequestOptions.none())

    /** @see exportDraft */
    @MustBeClosed
    fun exportDraft(tableIdOrName: String, requestOptions: RequestOptions): HttpResponse =
        exportDraft(tableIdOrName, TableExportDraftParams.none(), requestOptions)

    /**
     * Returns the details for the published version of the specified table. This will include the
     * definitions for the columns in the table and the number of rows in the table.
     *
     * **Note:** This endpoint can be accessed without any authentication if the table is set to be
     * allowed for public access. To do so, you'll need to include the HubSpot account ID in a
     * `portalId` query parameter.
     */
    fun get(tableIdOrName: String): HubDbTableV3 = get(tableIdOrName, TableGetParams.none())

    /** @see get */
    fun get(
        tableIdOrName: String,
        params: TableGetParams = TableGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HubDbTableV3 = get(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

    /** @see get */
    fun get(tableIdOrName: String, params: TableGetParams = TableGetParams.none()): HubDbTableV3 =
        get(tableIdOrName, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: TableGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HubDbTableV3

    /** @see get */
    fun get(params: TableGetParams): HubDbTableV3 = get(params, RequestOptions.none())

    /** @see get */
    fun get(tableIdOrName: String, requestOptions: RequestOptions): HubDbTableV3 =
        get(tableIdOrName, TableGetParams.none(), requestOptions)

    /**
     * Get the details for the draft version of a specific HubDB table. This will include the
     * definitions for the columns in the table and the number of rows in the table.
     */
    fun getDraft(tableIdOrName: String): HubDbTableV3 =
        getDraft(tableIdOrName, TableGetDraftParams.none())

    /** @see getDraft */
    fun getDraft(
        tableIdOrName: String,
        params: TableGetDraftParams = TableGetDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HubDbTableV3 =
        getDraft(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

    /** @see getDraft */
    fun getDraft(
        tableIdOrName: String,
        params: TableGetDraftParams = TableGetDraftParams.none(),
    ): HubDbTableV3 = getDraft(tableIdOrName, params, RequestOptions.none())

    /** @see getDraft */
    fun getDraft(
        params: TableGetDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HubDbTableV3

    /** @see getDraft */
    fun getDraft(params: TableGetDraftParams): HubDbTableV3 =
        getDraft(params, RequestOptions.none())

    /** @see getDraft */
    fun getDraft(tableIdOrName: String, requestOptions: RequestOptions): HubDbTableV3 =
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
    fun importDraft(tableIdOrName: String): ImportResult =
        importDraft(tableIdOrName, TableImportDraftParams.none())

    /** @see importDraft */
    fun importDraft(
        tableIdOrName: String,
        params: TableImportDraftParams = TableImportDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ImportResult =
        importDraft(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

    /** @see importDraft */
    fun importDraft(
        tableIdOrName: String,
        params: TableImportDraftParams = TableImportDraftParams.none(),
    ): ImportResult = importDraft(tableIdOrName, params, RequestOptions.none())

    /** @see importDraft */
    fun importDraft(
        params: TableImportDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ImportResult

    /** @see importDraft */
    fun importDraft(params: TableImportDraftParams): ImportResult =
        importDraft(params, RequestOptions.none())

    /** @see importDraft */
    fun importDraft(tableIdOrName: String, requestOptions: RequestOptions): ImportResult =
        importDraft(tableIdOrName, TableImportDraftParams.none(), requestOptions)

    /**
     * Returns the details for each draft table defined in the specified account, including column
     * definitions.
     */
    fun listDraft(): TableListDraftPage = listDraft(TableListDraftParams.none())

    /** @see listDraft */
    fun listDraft(
        params: TableListDraftParams = TableListDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TableListDraftPage

    /** @see listDraft */
    fun listDraft(params: TableListDraftParams = TableListDraftParams.none()): TableListDraftPage =
        listDraft(params, RequestOptions.none())

    /** @see listDraft */
    fun listDraft(requestOptions: RequestOptions): TableListDraftPage =
        listDraft(TableListDraftParams.none(), requestOptions)

    /**
     * Publishes the table by copying the data and table schema changes from draft version to the
     * published version, meaning any website pages using data from the table will be updated.
     */
    fun publishDraft(tableIdOrName: String): HubDbTableV3 =
        publishDraft(tableIdOrName, TablePublishDraftParams.none())

    /** @see publishDraft */
    fun publishDraft(
        tableIdOrName: String,
        params: TablePublishDraftParams = TablePublishDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HubDbTableV3 =
        publishDraft(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

    /** @see publishDraft */
    fun publishDraft(
        tableIdOrName: String,
        params: TablePublishDraftParams = TablePublishDraftParams.none(),
    ): HubDbTableV3 = publishDraft(tableIdOrName, params, RequestOptions.none())

    /** @see publishDraft */
    fun publishDraft(
        params: TablePublishDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HubDbTableV3

    /** @see publishDraft */
    fun publishDraft(params: TablePublishDraftParams): HubDbTableV3 =
        publishDraft(params, RequestOptions.none())

    /** @see publishDraft */
    fun publishDraft(tableIdOrName: String, requestOptions: RequestOptions): HubDbTableV3 =
        publishDraft(tableIdOrName, TablePublishDraftParams.none(), requestOptions)

    /**
     * Replaces the data in the draft version of the table with values from the published version.
     * Any unpublished changes in the draft will be lost after this call is made.
     */
    fun resetDraft(tableIdOrName: String): HubDbTableV3 =
        resetDraft(tableIdOrName, TableResetDraftParams.none())

    /** @see resetDraft */
    fun resetDraft(
        tableIdOrName: String,
        params: TableResetDraftParams = TableResetDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HubDbTableV3 =
        resetDraft(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

    /** @see resetDraft */
    fun resetDraft(
        tableIdOrName: String,
        params: TableResetDraftParams = TableResetDraftParams.none(),
    ): HubDbTableV3 = resetDraft(tableIdOrName, params, RequestOptions.none())

    /** @see resetDraft */
    fun resetDraft(
        params: TableResetDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HubDbTableV3

    /** @see resetDraft */
    fun resetDraft(params: TableResetDraftParams): HubDbTableV3 =
        resetDraft(params, RequestOptions.none())

    /** @see resetDraft */
    fun resetDraft(tableIdOrName: String, requestOptions: RequestOptions): HubDbTableV3 =
        resetDraft(tableIdOrName, TableResetDraftParams.none(), requestOptions)

    /**
     * Unpublishes the table, meaning any website pages using data from the table will not render
     * any data.
     */
    fun unpublish(tableIdOrName: String): HubDbTableV3 =
        unpublish(tableIdOrName, TableUnpublishParams.none())

    /** @see unpublish */
    fun unpublish(
        tableIdOrName: String,
        params: TableUnpublishParams = TableUnpublishParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HubDbTableV3 =
        unpublish(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

    /** @see unpublish */
    fun unpublish(
        tableIdOrName: String,
        params: TableUnpublishParams = TableUnpublishParams.none(),
    ): HubDbTableV3 = unpublish(tableIdOrName, params, RequestOptions.none())

    /** @see unpublish */
    fun unpublish(
        params: TableUnpublishParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HubDbTableV3

    /** @see unpublish */
    fun unpublish(params: TableUnpublishParams): HubDbTableV3 =
        unpublish(params, RequestOptions.none())

    /** @see unpublish */
    fun unpublish(tableIdOrName: String, requestOptions: RequestOptions): HubDbTableV3 =
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
    fun updateDraft(tableIdOrName: String, params: TableUpdateDraftParams): HubDbTableV3 =
        updateDraft(tableIdOrName, params, RequestOptions.none())

    /** @see updateDraft */
    fun updateDraft(
        tableIdOrName: String,
        params: TableUpdateDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HubDbTableV3 =
        updateDraft(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

    /** @see updateDraft */
    fun updateDraft(params: TableUpdateDraftParams): HubDbTableV3 =
        updateDraft(params, RequestOptions.none())

    /** @see updateDraft */
    fun updateDraft(
        params: TableUpdateDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HubDbTableV3

    /** A view of [TableService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TableService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /cms/hubdb/2026-03/tables`, but is otherwise the
         * same as [TableService.create].
         */
        @MustBeClosed
        fun create(params: TableCreateParams): HttpResponseFor<HubDbTableV3> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: TableCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HubDbTableV3>

        /** @see create */
        @MustBeClosed
        fun create(
            hubDbTableV3Request: HubDbTableV3Request,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HubDbTableV3> =
            create(
                TableCreateParams.builder().hubDbTableV3Request(hubDbTableV3Request).build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(hubDbTableV3Request: HubDbTableV3Request): HttpResponseFor<HubDbTableV3> =
            create(hubDbTableV3Request, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /cms/hubdb/2026-03/tables`, but is otherwise the
         * same as [TableService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<TableListPage> = list(TableListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TableListParams = TableListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TableListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: TableListParams = TableListParams.none()): HttpResponseFor<TableListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<TableListPage> =
            list(TableListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /cms/hubdb/2026-03/tables/{tableIdOrName}`, but
         * is otherwise the same as [TableService.delete].
         */
        @MustBeClosed
        fun delete(tableIdOrName: String): HttpResponse =
            delete(tableIdOrName, TableDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            tableIdOrName: String,
            params: TableDeleteParams = TableDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            tableIdOrName: String,
            params: TableDeleteParams = TableDeleteParams.none(),
        ): HttpResponse = delete(tableIdOrName, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: TableDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: TableDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(tableIdOrName: String, requestOptions: RequestOptions): HttpResponse =
            delete(tableIdOrName, TableDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/hubdb/2026-03/tables/{tableIdOrName}/draft/clone`, but is otherwise the same as
         * [TableService.cloneDraft].
         */
        @MustBeClosed
        fun cloneDraft(
            tableIdOrName: String,
            params: TableCloneDraftParams,
        ): HttpResponseFor<HubDbTableV3> = cloneDraft(tableIdOrName, params, RequestOptions.none())

        /** @see cloneDraft */
        @MustBeClosed
        fun cloneDraft(
            tableIdOrName: String,
            params: TableCloneDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HubDbTableV3> =
            cloneDraft(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

        /** @see cloneDraft */
        @MustBeClosed
        fun cloneDraft(params: TableCloneDraftParams): HttpResponseFor<HubDbTableV3> =
            cloneDraft(params, RequestOptions.none())

        /** @see cloneDraft */
        @MustBeClosed
        fun cloneDraft(
            params: TableCloneDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HubDbTableV3>

        /**
         * Returns a raw HTTP response for `delete
         * /cms/hubdb/2026-03/tables/{tableIdOrName}/versions/{versionId}`, but is otherwise the
         * same as [TableService.deleteVersion].
         */
        @MustBeClosed
        fun deleteVersion(versionId: Long, params: TableDeleteVersionParams): HttpResponse =
            deleteVersion(versionId, params, RequestOptions.none())

        /** @see deleteVersion */
        @MustBeClosed
        fun deleteVersion(
            versionId: Long,
            params: TableDeleteVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteVersion(params.toBuilder().versionId(versionId).build(), requestOptions)

        /** @see deleteVersion */
        @MustBeClosed
        fun deleteVersion(params: TableDeleteVersionParams): HttpResponse =
            deleteVersion(params, RequestOptions.none())

        /** @see deleteVersion */
        @MustBeClosed
        fun deleteVersion(
            params: TableDeleteVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /cms/hubdb/2026-03/tables/{tableIdOrName}/export`,
         * but is otherwise the same as [TableService.export].
         */
        @MustBeClosed
        fun export(tableIdOrName: String): HttpResponse =
            export(tableIdOrName, TableExportParams.none())

        /** @see export */
        @MustBeClosed
        fun export(
            tableIdOrName: String,
            params: TableExportParams = TableExportParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            export(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

        /** @see export */
        @MustBeClosed
        fun export(
            tableIdOrName: String,
            params: TableExportParams = TableExportParams.none(),
        ): HttpResponse = export(tableIdOrName, params, RequestOptions.none())

        /** @see export */
        @MustBeClosed
        fun export(
            params: TableExportParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see export */
        @MustBeClosed
        fun export(params: TableExportParams): HttpResponse = export(params, RequestOptions.none())

        /** @see export */
        @MustBeClosed
        fun export(tableIdOrName: String, requestOptions: RequestOptions): HttpResponse =
            export(tableIdOrName, TableExportParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /cms/hubdb/2026-03/tables/{tableIdOrName}/draft/export`, but is otherwise the same as
         * [TableService.exportDraft].
         */
        @MustBeClosed
        fun exportDraft(tableIdOrName: String): HttpResponse =
            exportDraft(tableIdOrName, TableExportDraftParams.none())

        /** @see exportDraft */
        @MustBeClosed
        fun exportDraft(
            tableIdOrName: String,
            params: TableExportDraftParams = TableExportDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            exportDraft(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

        /** @see exportDraft */
        @MustBeClosed
        fun exportDraft(
            tableIdOrName: String,
            params: TableExportDraftParams = TableExportDraftParams.none(),
        ): HttpResponse = exportDraft(tableIdOrName, params, RequestOptions.none())

        /** @see exportDraft */
        @MustBeClosed
        fun exportDraft(
            params: TableExportDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see exportDraft */
        @MustBeClosed
        fun exportDraft(params: TableExportDraftParams): HttpResponse =
            exportDraft(params, RequestOptions.none())

        /** @see exportDraft */
        @MustBeClosed
        fun exportDraft(tableIdOrName: String, requestOptions: RequestOptions): HttpResponse =
            exportDraft(tableIdOrName, TableExportDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/hubdb/2026-03/tables/{tableIdOrName}`, but is
         * otherwise the same as [TableService.get].
         */
        @MustBeClosed
        fun get(tableIdOrName: String): HttpResponseFor<HubDbTableV3> =
            get(tableIdOrName, TableGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            tableIdOrName: String,
            params: TableGetParams = TableGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HubDbTableV3> =
            get(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            tableIdOrName: String,
            params: TableGetParams = TableGetParams.none(),
        ): HttpResponseFor<HubDbTableV3> = get(tableIdOrName, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: TableGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HubDbTableV3>

        /** @see get */
        @MustBeClosed
        fun get(params: TableGetParams): HttpResponseFor<HubDbTableV3> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            tableIdOrName: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HubDbTableV3> = get(tableIdOrName, TableGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/hubdb/2026-03/tables/{tableIdOrName}/draft`,
         * but is otherwise the same as [TableService.getDraft].
         */
        @MustBeClosed
        fun getDraft(tableIdOrName: String): HttpResponseFor<HubDbTableV3> =
            getDraft(tableIdOrName, TableGetDraftParams.none())

        /** @see getDraft */
        @MustBeClosed
        fun getDraft(
            tableIdOrName: String,
            params: TableGetDraftParams = TableGetDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HubDbTableV3> =
            getDraft(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

        /** @see getDraft */
        @MustBeClosed
        fun getDraft(
            tableIdOrName: String,
            params: TableGetDraftParams = TableGetDraftParams.none(),
        ): HttpResponseFor<HubDbTableV3> = getDraft(tableIdOrName, params, RequestOptions.none())

        /** @see getDraft */
        @MustBeClosed
        fun getDraft(
            params: TableGetDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HubDbTableV3>

        /** @see getDraft */
        @MustBeClosed
        fun getDraft(params: TableGetDraftParams): HttpResponseFor<HubDbTableV3> =
            getDraft(params, RequestOptions.none())

        /** @see getDraft */
        @MustBeClosed
        fun getDraft(
            tableIdOrName: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HubDbTableV3> =
            getDraft(tableIdOrName, TableGetDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/hubdb/2026-03/tables/{tableIdOrName}/draft/import`, but is otherwise the same as
         * [TableService.importDraft].
         */
        @MustBeClosed
        fun importDraft(tableIdOrName: String): HttpResponseFor<ImportResult> =
            importDraft(tableIdOrName, TableImportDraftParams.none())

        /** @see importDraft */
        @MustBeClosed
        fun importDraft(
            tableIdOrName: String,
            params: TableImportDraftParams = TableImportDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ImportResult> =
            importDraft(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

        /** @see importDraft */
        @MustBeClosed
        fun importDraft(
            tableIdOrName: String,
            params: TableImportDraftParams = TableImportDraftParams.none(),
        ): HttpResponseFor<ImportResult> = importDraft(tableIdOrName, params, RequestOptions.none())

        /** @see importDraft */
        @MustBeClosed
        fun importDraft(
            params: TableImportDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ImportResult>

        /** @see importDraft */
        @MustBeClosed
        fun importDraft(params: TableImportDraftParams): HttpResponseFor<ImportResult> =
            importDraft(params, RequestOptions.none())

        /** @see importDraft */
        @MustBeClosed
        fun importDraft(
            tableIdOrName: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ImportResult> =
            importDraft(tableIdOrName, TableImportDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/hubdb/2026-03/tables/draft`, but is otherwise
         * the same as [TableService.listDraft].
         */
        @MustBeClosed
        fun listDraft(): HttpResponseFor<TableListDraftPage> =
            listDraft(TableListDraftParams.none())

        /** @see listDraft */
        @MustBeClosed
        fun listDraft(
            params: TableListDraftParams = TableListDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TableListDraftPage>

        /** @see listDraft */
        @MustBeClosed
        fun listDraft(
            params: TableListDraftParams = TableListDraftParams.none()
        ): HttpResponseFor<TableListDraftPage> = listDraft(params, RequestOptions.none())

        /** @see listDraft */
        @MustBeClosed
        fun listDraft(requestOptions: RequestOptions): HttpResponseFor<TableListDraftPage> =
            listDraft(TableListDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/hubdb/2026-03/tables/{tableIdOrName}/draft/publish`, but is otherwise the same as
         * [TableService.publishDraft].
         */
        @MustBeClosed
        fun publishDraft(tableIdOrName: String): HttpResponseFor<HubDbTableV3> =
            publishDraft(tableIdOrName, TablePublishDraftParams.none())

        /** @see publishDraft */
        @MustBeClosed
        fun publishDraft(
            tableIdOrName: String,
            params: TablePublishDraftParams = TablePublishDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HubDbTableV3> =
            publishDraft(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

        /** @see publishDraft */
        @MustBeClosed
        fun publishDraft(
            tableIdOrName: String,
            params: TablePublishDraftParams = TablePublishDraftParams.none(),
        ): HttpResponseFor<HubDbTableV3> =
            publishDraft(tableIdOrName, params, RequestOptions.none())

        /** @see publishDraft */
        @MustBeClosed
        fun publishDraft(
            params: TablePublishDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HubDbTableV3>

        /** @see publishDraft */
        @MustBeClosed
        fun publishDraft(params: TablePublishDraftParams): HttpResponseFor<HubDbTableV3> =
            publishDraft(params, RequestOptions.none())

        /** @see publishDraft */
        @MustBeClosed
        fun publishDraft(
            tableIdOrName: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HubDbTableV3> =
            publishDraft(tableIdOrName, TablePublishDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/hubdb/2026-03/tables/{tableIdOrName}/draft/reset`, but is otherwise the same as
         * [TableService.resetDraft].
         */
        @MustBeClosed
        fun resetDraft(tableIdOrName: String): HttpResponseFor<HubDbTableV3> =
            resetDraft(tableIdOrName, TableResetDraftParams.none())

        /** @see resetDraft */
        @MustBeClosed
        fun resetDraft(
            tableIdOrName: String,
            params: TableResetDraftParams = TableResetDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HubDbTableV3> =
            resetDraft(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

        /** @see resetDraft */
        @MustBeClosed
        fun resetDraft(
            tableIdOrName: String,
            params: TableResetDraftParams = TableResetDraftParams.none(),
        ): HttpResponseFor<HubDbTableV3> = resetDraft(tableIdOrName, params, RequestOptions.none())

        /** @see resetDraft */
        @MustBeClosed
        fun resetDraft(
            params: TableResetDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HubDbTableV3>

        /** @see resetDraft */
        @MustBeClosed
        fun resetDraft(params: TableResetDraftParams): HttpResponseFor<HubDbTableV3> =
            resetDraft(params, RequestOptions.none())

        /** @see resetDraft */
        @MustBeClosed
        fun resetDraft(
            tableIdOrName: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HubDbTableV3> =
            resetDraft(tableIdOrName, TableResetDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/hubdb/2026-03/tables/{tableIdOrName}/unpublish`, but is otherwise the same as
         * [TableService.unpublish].
         */
        @MustBeClosed
        fun unpublish(tableIdOrName: String): HttpResponseFor<HubDbTableV3> =
            unpublish(tableIdOrName, TableUnpublishParams.none())

        /** @see unpublish */
        @MustBeClosed
        fun unpublish(
            tableIdOrName: String,
            params: TableUnpublishParams = TableUnpublishParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HubDbTableV3> =
            unpublish(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

        /** @see unpublish */
        @MustBeClosed
        fun unpublish(
            tableIdOrName: String,
            params: TableUnpublishParams = TableUnpublishParams.none(),
        ): HttpResponseFor<HubDbTableV3> = unpublish(tableIdOrName, params, RequestOptions.none())

        /** @see unpublish */
        @MustBeClosed
        fun unpublish(
            params: TableUnpublishParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HubDbTableV3>

        /** @see unpublish */
        @MustBeClosed
        fun unpublish(params: TableUnpublishParams): HttpResponseFor<HubDbTableV3> =
            unpublish(params, RequestOptions.none())

        /** @see unpublish */
        @MustBeClosed
        fun unpublish(
            tableIdOrName: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HubDbTableV3> =
            unpublish(tableIdOrName, TableUnpublishParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /cms/hubdb/2026-03/tables/{tableIdOrName}/draft`,
         * but is otherwise the same as [TableService.updateDraft].
         */
        @MustBeClosed
        fun updateDraft(
            tableIdOrName: String,
            params: TableUpdateDraftParams,
        ): HttpResponseFor<HubDbTableV3> = updateDraft(tableIdOrName, params, RequestOptions.none())

        /** @see updateDraft */
        @MustBeClosed
        fun updateDraft(
            tableIdOrName: String,
            params: TableUpdateDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HubDbTableV3> =
            updateDraft(params.toBuilder().tableIdOrName(tableIdOrName).build(), requestOptions)

        /** @see updateDraft */
        @MustBeClosed
        fun updateDraft(params: TableUpdateDraftParams): HttpResponseFor<HubDbTableV3> =
            updateDraft(params, RequestOptions.none())

        /** @see updateDraft */
        @MustBeClosed
        fun updateDraft(
            params: TableUpdateDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HubDbTableV3>
    }
}
